package com.example.studentmanager.Repository;

import com.example.studentmanager.Entity.StudentTuition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
import java.util.List;

@Repository
public interface StudentTuitionRepository extends JpaRepository<StudentTuition, UUID> {
    List<StudentTuition> findByStudentId(Integer studentId);
}
