package com.example.search.Service;

import com.example.restapitest.pojo.dto.UserResponseDTO;
import com.example.restapitest.pojo.dto.UserResponseDTO.*;
import com.example.search.pojo.entity.People;
import com.sample.classmanagement.model.entity.StudentEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = {"com.example.classmanagement", "com.example.restapitest"})
public interface SearchService {

    People getAllUsers();
}
