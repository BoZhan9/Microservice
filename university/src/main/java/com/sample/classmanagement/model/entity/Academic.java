/*

package com.sample.classmanagement.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@Entity
@Table(name = "academic")
@AllArgsConstructor
@NoArgsConstructor
public class Academic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String name;
    @Column
    @JsonIgnore
    private String gender;
    @Column
    private String role;
    @Column
    @JsonIgnore
    private Date lastAccessDate;
    @Column
    @JsonIgnore
    private boolean isActive;
}

 */
