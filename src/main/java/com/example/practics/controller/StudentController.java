package com.example.practics.controller;

import com.example.practics.entity.Student;
import com.example.practics.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("rest/stu")
public class StudentController {
    @Autowired
    private StudentRepository studentrepo;
    @GetMapping("getdata")
     public List<Student> getStudentsDetails(){
       return  studentrepo.findAll();
    }
}
