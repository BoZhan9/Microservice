package com.sample.classmanagement.model.entity;

import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private Integer id;
    @Column(name = "stu_name")
    private String name;
    @Column(name = "stu_gender")
    private String gender;
    @Column(name = "stu_score")
    private Integer score;
    @CreationTimestamp
    @Column(name = "create_time")
    private Timestamp created;
    @UpdateTimestamp
    @Column(name = "update_time")
    private Timestamp updated;


    public StudentEntity(Integer id, String name, String gender, Integer score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public StudentEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
