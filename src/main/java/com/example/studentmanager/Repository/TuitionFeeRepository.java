package com.example.studentmanager.Repository;

import com.example.studentmanager.Entity.TuitionFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface TuitionFeeRepository extends JpaRepository<TuitionFee, UUID> {
}
