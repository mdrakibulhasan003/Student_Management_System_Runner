package com.student_management_system.Student_Management_System_Runner.runner;

import com.student_management_system.Student_Management_System_Runner.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoggingRunner implements CommandLineRunner {

    private final StudentService studentService;

    public LoggingRunner(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void run(String...args) throws Exception{
        System.out.println("CommandLineRuner: Application started successfully!");
        System.out.println("CommandLineRunner: Arguments received: " +String.join(", ", args));
    }
}
