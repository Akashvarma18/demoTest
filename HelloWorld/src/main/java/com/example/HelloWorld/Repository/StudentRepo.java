package com.example.HelloWorld.Repository;

import com.example.HelloWorld.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    public List<Student> findAll();
    /// ////


    /// nice commit //



}
