package com.sample.classmanagement.service.impl;

import com.sample.classmanagement.model.entity.StudentEntity;
import com.sample.classmanagement.exception.ResourceNotFoundException;
import com.sample.classmanagement.repository.StudentRepository;
import com.sample.classmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentEntity addStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public List<StudentEntity> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity findStudentById(Integer id) {
        return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("student not found with provided id: " + id));
    }

    @Override
    public StudentEntity updateStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public void removeStudentById(Integer id) {
        studentRepository.deleteById(id);
    }
}
