package com.sample.classmanagement.controller;

import com.sample.classmanagement.model.entity.ProfessorEntity;
import com.sample.classmanagement.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    private final ProfessorService professorService;

    @Autowired
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PostMapping
    public ProfessorEntity addProfessor(@RequestBody ProfessorEntity professorEntity) {
        return professorService.addProfessor(professorEntity);
    }
    @GetMapping
    public List<ProfessorEntity> findAllProfessors(){
        return professorService.findAllProfessors();
    }
    @GetMapping("/{id}")
    public ProfessorEntity findStudentById(@PathVariable("id") Integer id) {
        return professorService.findProfessorById(id);
    }

    @PutMapping
    public ProfessorEntity updateProfessor(@RequestBody ProfessorEntity professorEntity) {
        return professorService.updateProfessor(professorEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") Integer id) {
        professorService.removeProfessorById(id);
    }
}
