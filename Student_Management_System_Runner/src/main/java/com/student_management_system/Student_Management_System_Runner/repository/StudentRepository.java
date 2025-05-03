package com.student_management_system.Student_Management_System_Runner.repository;

import com.student_management_system.Student_Management_System_Runner.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
