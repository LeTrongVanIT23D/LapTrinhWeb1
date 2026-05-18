package com.example.studentmanager.Service;

import com.example.studentmanager.Entity.StudentTuition;
import com.example.studentmanager.Repository.StudentTuitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class StudentTuitionService {

    @Autowired
    private StudentTuitionRepository repository;

    public List<StudentTuition> getAll() {
        return repository.findAll();
    }

    public StudentTuition getById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public List<StudentTuition> getByStudentId(Integer studentId) {
        return repository.findByStudentId(studentId);
    }

    public StudentTuition save(StudentTuition studentTuition) {
        return repository.save(studentTuition);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
