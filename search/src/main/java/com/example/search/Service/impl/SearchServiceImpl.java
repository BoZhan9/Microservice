package com.example.search.Service.impl;

import com.example.restapitest.pojo.dto.UserResponseDTO;
import com.example.restapitest.pojo.entity.User;
import com.example.restapitest.repository.UserRepository;
import com.example.search.Service.SearchService;
import com.example.search.pojo.entity.People;
import com.sample.classmanagement.exception.ResourceNotFoundException;
import com.sample.classmanagement.model.dto.StudentResponseDTO;
import com.sample.classmanagement.model.entity.StudentEntity;
import com.sample.classmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
@EnableAutoConfiguration
public class SearchServiceImpl implements SearchService {

    private final RestTemplate restTemplate;

    private final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();


    @Autowired
    public SearchServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public People getAllUsers() {
        CompletableFuture<UserResponseDTO> completableFutureUsers = CompletableFuture.supplyAsync(
                () -> restTemplate.getForObject("http://provider-service/userinfo", UserResponseDTO.class), executor.getThreadPoolExecutor());
        CompletableFuture<StudentResponseDTO> completableFutureStudents = CompletableFuture.supplyAsync(
                () -> restTemplate.getForObject("http://university-service/students", StudentResponseDTO.class), executor.getThreadPoolExecutor());
        return completableFutureUsers.thenCombine(completableFutureStudents, People::new).join();

    }
}
