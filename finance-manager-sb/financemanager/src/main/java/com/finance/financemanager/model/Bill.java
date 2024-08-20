package com.finance.financemanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Bill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable= false, updatable = false)
    private Long id;
    private Long userId;
    private String billDescription;
    private Number billAmount;
    private String billFrequency;
    private String billPaymentDueDate;
    private String billCompany;
    private String billPaymentPortalUrl;
    private Boolean billAutoPay;
    @Column(nullable= false, updatable = false)
    private String billCode;

    public Bill() {}

    public Bill(Long userId, String billDescription, Number billAmount, String billFrequency, String billPaymentDueDate, String billCompany, String billPaymentPortalUrl, Boolean billAutoPay, String billCode) {
        this.userId = userId;
        this.billDescription = billDescription;
        this.billAmount = billAmount;
        this.billFrequency = billFrequency;
        this.billPaymentDueDate = billPaymentDueDate;
        this.billCompany = billCompany;
        this.billPaymentPortalUrl = billPaymentPortalUrl;
        this.billAutoPay = billAutoPay;
        this.billCode = billCode;
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

    public String getBillDescription() {
        return billDescription;
    }

    public void setBillDescription(String billDescription) {
        this.billDescription = billDescription;
    }

    public Number getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Number billAmount) {
        this.billAmount = billAmount;
    }

    public String getBillFrequency() {
        return billFrequency;
    }

    public void setBillFrequency(String billFrequency) {
        this.billFrequency = billFrequency;
    }

    public String getBillPaymentDueDate() {
        return billPaymentDueDate;
    }

    public void setBillPaymentDueDate(String billPaymentDueDate) {
        this.billPaymentDueDate = billPaymentDueDate;
    }

    public String getBillCompany() {
        return billCompany;
    }

    public void setBillCompany(String billCompany) { this.billCompany = billCompany; }

    public String getBillPaymentPortalUrl() {
        return billPaymentPortalUrl;
    }

    public void setBillPaymentPortalUrl(String billPaymentPortalUrl) {
        this.billPaymentPortalUrl = billPaymentPortalUrl;
    }

    public Boolean getBillAutoPay() {
        return billAutoPay;
    }

    public void setBillAutoPay(Boolean billAutoPay) {
        this.billAutoPay = billAutoPay;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    @Override
    public String toString() {
        return "Billing {" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", billDescription='" + billDescription + '\'' +
                ", billAmount='" + billAmount + '\'' +
                ", billFrequency='" + billFrequency + '\'' +
                ", billPaymentDueDate='" + billPaymentDueDate + '\'' +
                ", billCompany='" + billCompany + '\'' +
                ", billPaymentPortalUrl='" + billPaymentPortalUrl + '\'' +
                ", billAutoPay='" + billAutoPay + '\'' +
                ", billCode='" + billCode + '\'' +
                '}';

    }
}
