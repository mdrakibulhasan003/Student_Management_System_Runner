package com.student_management_system.Student_Management_System_Runner.controller;

import com.student_management_system.Student_Management_System_Runner.model.Student;
import com.student_management_system.Student_Management_System_Runner.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String getAllStudents(){
        studentService.getAllStudents();
        return "student-list";
    }
}
