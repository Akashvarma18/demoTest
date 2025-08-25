package com.example.HelloWorld.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @Column(unique = true, length = 100)
    private String email;

    @Column(length = 100)
    private String course;

    }

