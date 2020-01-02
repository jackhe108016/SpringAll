package com.springboot.controller;

import com.springboot.bean.Student;
import com.springboot.service.IStudentServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    IStudentServie studentServie;
    @RequestMapping("/getStuBySno")
    public Student getAll(){
        return studentServie.queryStudentBySno("001");
    }
}
