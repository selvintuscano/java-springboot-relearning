package com.RestAPIs.RestAPIs.service.impl;

import com.RestAPIs.RestAPIs.dto.Studentdto;
import com.RestAPIs.RestAPIs.entity.Student;
import com.RestAPIs.RestAPIs.repository.StudentRepository;
import com.RestAPIs.RestAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    @Override
    public List<Studentdto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<Studentdto> studentdtoList = students.stream().map(Student student -> new Studentdto(student.getId(), student.getName(), student.getemail()))
       ;
    }
}
