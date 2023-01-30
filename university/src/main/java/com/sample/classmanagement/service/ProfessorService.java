package com.sample.classmanagement.service;

import com.sample.classmanagement.model.entity.ProfessorEntity;

import java.util.List;

public interface ProfessorService {

    ProfessorEntity addProfessor(ProfessorEntity professorEntity); // create
    List<ProfessorEntity > findAllProfessors(); // read
    ProfessorEntity findProfessorById(Integer id); // read
    ProfessorEntity  updateProfessor(ProfessorEntity professorEntity); // update
    void removeProfessorById(Integer id); // delete
}
