package com.example.studentmanager.Service;

import com.example.studentmanager.Entity.TuitionFee;
import com.example.studentmanager.Repository.TuitionFeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class TuitionFeeService {

    @Autowired
    private TuitionFeeRepository repository;

    public List<TuitionFee> getAll() {
        return repository.findAll();
    }

    public TuitionFee getById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public TuitionFee save(TuitionFee tuitionFee) {
        return repository.save(tuitionFee);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
