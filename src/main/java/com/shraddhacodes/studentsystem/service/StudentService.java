package com.shraddhacodes.studentsystem.service;

import com.shraddhacodes.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
