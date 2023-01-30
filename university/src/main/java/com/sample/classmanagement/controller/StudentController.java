package com.sample.classmanagement.controller;

import com.sample.classmanagement.model.entity.StudentEntity;
import com.sample.classmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentEntity addStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.addStudent(studentEntity);
    }
    @GetMapping
    public List<StudentEntity> findAllStudents(){
        return studentService.findAllStudents();
    }
    @GetMapping("/{id}")
    public StudentEntity findStudentById(@PathVariable("id") Integer id) {
        return studentService.findStudentById(id);
    }

    @PutMapping
    public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.updateStudent(studentEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") Integer id) {
        studentService.removeStudentById(id);
    }
}
