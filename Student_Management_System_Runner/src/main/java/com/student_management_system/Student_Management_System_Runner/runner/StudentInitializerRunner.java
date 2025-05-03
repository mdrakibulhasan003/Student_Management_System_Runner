package com.student_management_system.Student_Management_System_Runner.runner;

import com.student_management_system.Student_Management_System_Runner.model.Student;
import com.student_management_system.Student_Management_System_Runner.service.StudentService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentInitializerRunner implements ApplicationRunner {

    private final StudentService studentService;

    public StudentInitializerRunner(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println("ApplicationRunner: Initializing students....");
        studentService.addStudent(new Student("Hamid Sikdar", "hamid@gmail.com"));
        studentService.addStudent(new Student("Hasan Ali","hasan@gmail.com"));
        System.out.println("ApplicationRunner: Students initiated");
    }
}
