package com.example.HelloWorld.controller;

import com.example.HelloWorld.Model.Student;
import com.example.HelloWorld.Service.service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Controller {

    private service service;

    @GetMapping("/test")
    public List<Student> testGet(){
        return service.findAll();
    }

}
