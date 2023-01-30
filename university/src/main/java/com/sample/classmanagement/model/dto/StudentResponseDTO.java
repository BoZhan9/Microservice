package com.sample.classmanagement.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sample.classmanagement.model.entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class StudentResponseDTO {
    @JsonProperty("studentList")
    private List<StudentDTO> studentList;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StudentDTO {
        private Integer id;

        private String name;

        private String gender;

        private Integer score;

        public StudentDTO(StudentEntity studentEntity){
            this.id = studentEntity.getId();
            this.name = studentEntity.getName();
            this.gender = studentEntity.getGender();
            this.score = studentEntity.getScore();
        }



    }
}
