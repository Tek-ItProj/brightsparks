package com.brightsparks.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "communities")
@Data
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String subject;
    private String gradeLevel;

    // Getters and setters...
}