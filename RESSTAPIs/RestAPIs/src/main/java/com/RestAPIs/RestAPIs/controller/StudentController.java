package com.RestAPIs.RestAPIs.controller;

import com.RestAPIs.RestAPIs.dto.Studentdto;
import com.RestAPIs.RestAPIs.entity.Student;
import com.RestAPIs.RestAPIs.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;
    private Long id;
    private String name;
    private String email;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public Studentdto getStudentById(){
        return new  Studentdto(4L,"Selvin","sevin@gmail.com");

    }
}
