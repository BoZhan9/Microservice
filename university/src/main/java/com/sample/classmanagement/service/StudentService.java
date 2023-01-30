package com.sample.classmanagement.service;

import com.sample.classmanagement.model.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    StudentEntity addStudent(StudentEntity studentEntity); // create
    List<StudentEntity> findAllStudents(); // read
    StudentEntity findStudentById(Integer id); // read
    StudentEntity updateStudent(StudentEntity studentEntity); // update
    void removeStudentById(Integer id); // delete
}
