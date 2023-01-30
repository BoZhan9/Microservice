package com.sample.classmanagement.repository;

import com.sample.classmanagement.model.entity.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Integer> {
}
