package com.example.search.pojo.entity;

import com.example.restapitest.pojo.dto.UserResponseDTO;
import com.sample.classmanagement.model.dto.StudentResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People implements Serializable {
    private UserResponseDTO userList;
    private StudentResponseDTO studentList;
}
