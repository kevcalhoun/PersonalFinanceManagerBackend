package com.finance.financemanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Liability implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable= false, updatable = false)
    private Long id;
    private Long userId;
    private String liabilityName;
    private String liabilityType;
    private Number liabilityRemainingAmount;
    private Number liabilityInterestRate;
    private Number liabilityMinMonthlyPayment;
    private String liabilityEstimatedPayoffDate;
    @Column(nullable= false, updatable = false)
    private String liabilityCode;

    public Liability() {}

    public Liability(Long userId, String liabilityName, String liabilityType, Number liabilityRemainingAmount, Number liabilityInterestRate, Number liabilityMinMonthlyPayment, String liabilityEstimatedPayoffDate, String liabilityCode) {
        this.liabilityName = liabilityName;
        this.liabilityType = liabilityType;
        this.liabilityRemainingAmount = liabilityRemainingAmount;
        this.liabilityInterestRate = liabilityInterestRate;
        this.liabilityMinMonthlyPayment = liabilityMinMonthlyPayment;
        this.liabilityEstimatedPayoffDate = liabilityEstimatedPayoffDate;
        this.liabilityCode = liabilityCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLiabilityName() {
        return liabilityName;
    }

    public void setLiabilityName(String liabilityName) {
        this.liabilityName = liabilityName;
    }

    public String getLiabilityType() {
        return liabilityType;
    }

    public void setLiabilityType(String liabilityType) {
        this.liabilityType = liabilityType;
    }

    public Number getLiabilityRemainingAmount() {
        return liabilityRemainingAmount;
    }

    public void setLiabilityRemainingAmount(Number liabilityRemainingAmount) {
        this.liabilityRemainingAmount = liabilityRemainingAmount;
    }

    public Number getLiabilityInterestRate() {
        return liabilityInterestRate;
    }

    public void setLiabilityInterestRate(Number liabilityInterestRate) {
        this.liabilityInterestRate = liabilityInterestRate;
    }

    public Number getLiabilityMinMonthlyPayment() {
        return liabilityMinMonthlyPayment;
    }

    public void setLiabilityMinMonthlyPayment(Number liabilityMinMonthlyPayment) {
        this.liabilityMinMonthlyPayment = liabilityMinMonthlyPayment;
    }

    public String getLiabilityEstimatedPayoffDate() {
        return liabilityEstimatedPayoffDate;
    }

    public void setLiabilityEstimatedPayoffDate(String liabilityEstimatedPayoffDate) {
        this.liabilityEstimatedPayoffDate = liabilityEstimatedPayoffDate;
    }

    public String getLiabilityCode() {
        return liabilityCode;
    }

    public void setLiabilityCode(String liabilityCode) {
        this.liabilityCode = liabilityCode;
    }

    @Override
    public String toString() {
        return "Liabiity{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", liabilityName='" + liabilityName + '\'' +
                ", liabilityType='" + liabilityType + '\'' +
                ", liabilityRemainingAmount='" + liabilityRemainingAmount + '\'' +
                ", liabilityInterestRate='" + liabilityInterestRate + '\'' +
                ", liabilityMinMonthlyPayment='" + liabilityMinMonthlyPayment + '\'' +
                ", liabilityEstimatedPayoffDate='" + liabilityEstimatedPayoffDate + '\'' +
                ", liabilityCode='" + liabilityCode + '\'' +
                '}';

    }


}
