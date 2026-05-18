package com.example.studentmanager.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tuition_fees")
public class TuitionFee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fee_id", updatable = false, nullable = false)
    private UUID feeId;

    @Column(name = "program_id")
    private UUID programId;

    @Column(name = "course_year", length = 10)
    private String courseYear;

    @Column(name = "price_per_credit", precision = 15, scale = 2)
    private BigDecimal pricePerCredit;

    @Column(name = "base_tuition", precision = 15, scale = 2)
    private BigDecimal baseTuition;

    @Column(name = "effective_date")
    private LocalDate effectiveDate;

    @Column(name = "is_active")
    private boolean isActive;

    public TuitionFee() {
    }

    public UUID getFeeId() {
        return feeId;
    }

    public void setFeeId(UUID feeId) {
        this.feeId = feeId;
    }

    public UUID getProgramId() {
        return programId;
    }

    public void setProgramId(UUID programId) {
        this.programId = programId;
    }

    public String getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(String courseYear) {
        this.courseYear = courseYear;
    }

    public BigDecimal getPricePerCredit() {
        return pricePerCredit;
    }

    public void setPricePerCredit(BigDecimal pricePerCredit) {
        this.pricePerCredit = pricePerCredit;
    }

    public BigDecimal getBaseTuition() {
        return baseTuition;
    }

    public void setBaseTuition(BigDecimal baseTuition) {
        this.baseTuition = baseTuition;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
