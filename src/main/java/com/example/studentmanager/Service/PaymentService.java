package com.example.studentmanager.Service;

import com.example.studentmanager.Entity.Payment;
import com.example.studentmanager.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public List<Payment> getAll() {
        return repository.findAll();
    }

    public Payment getById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public List<Payment> getByTuitionId(UUID tuitionId) {
        return repository.findByTuitionId(tuitionId);
    }

    public Payment save(Payment payment) {
        return repository.save(payment);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
