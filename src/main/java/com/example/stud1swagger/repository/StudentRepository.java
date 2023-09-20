package com.example.stud1swagger.repository;

import com.example.stud1swagger.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
