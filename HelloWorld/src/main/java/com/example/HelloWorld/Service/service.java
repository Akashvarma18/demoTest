package com.example.HelloWorld.Service;

import com.example.HelloWorld.Model.Student;
import com.example.HelloWorld.Repository.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class service {

    private StudentRepo studentRepo;

    public List<Student> findAll(){
        return  studentRepo.findAll();
    }




}
