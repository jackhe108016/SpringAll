package com.springboot.service;

import com.springboot.bean.Student;

public interface IStudentServie {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
}
