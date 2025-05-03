package com.student_management_system.Student_Management_System_Runner.service;

import com.student_management_system.Student_Management_System_Runner.model.Student;
import com.student_management_system.Student_Management_System_Runner.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }
}
