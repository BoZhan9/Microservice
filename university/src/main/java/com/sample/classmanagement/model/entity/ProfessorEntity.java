package com.sample.classmanagement.model.entity;

import javax.persistence.*;
import org.hibernate.annotations.Where;

import java.sql.Timestamp;

@Entity
@Table(name = "professor")
@Where(clause = "deleted = false")
public class ProfessorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prof_id")
    private Integer id;
    @Column(name = "prof_name")
    private String name;
    @Column(name = "prof_gender")
    private String gender;
    @Column(name = "prof_subject")
    private String subject;

    private boolean deleted = Boolean.FALSE;

    @Column(name = "create_time")
    private Timestamp created;

    @Column(name = "update_time")
    private Timestamp updated;

    @PrePersist
    protected void onCreate() {
        created = new Timestamp(System.currentTimeMillis());
    }
    @PreUpdate
    protected void onUpdate() {
        updated = new Timestamp(System.currentTimeMillis());
    }

    public ProfessorEntity(Integer id, String name, String gender, String subject) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.subject = subject;
    }

    public ProfessorEntity() {
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


}
