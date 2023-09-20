package com.example.stud1swagger.Service;

import com.example.stud1swagger.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> allStudents();
    Student addStudent(Student student);
}
