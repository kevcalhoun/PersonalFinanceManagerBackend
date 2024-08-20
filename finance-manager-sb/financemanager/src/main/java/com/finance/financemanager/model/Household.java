package com.finance.financemanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Household implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String householdUsername;
    private String householdPassword;
    private String householdName;
    private String householdCreatedDate;
    @Column(nullable= false, updatable = false)
    private String householdCode;

    public Household() {}

    public Household(String householdUsername, String householdPassword, String householdName, String householdCreatedDate, String householdCode) {
        this.householdUsername = householdUsername;
        this.householdPassword = householdPassword;
        this.householdName = householdName;
        this.householdCreatedDate = householdCreatedDate;
        this.householdCode = householdCode;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getHouseholdUsername() { return householdUsername; }

    public void setHouseholdUsername(String householdUsername) { this.householdUsername = householdUsername; }

    public String getHouseholdPassword() {
        return householdPassword;
    }

    public void setHouseholdPassword(String householdPassword) {
        this.householdPassword = householdPassword;
    }

    public String getHouseholdName() {
        return householdName;
    }

    public void setHouseholdName(String householdName) {
        this.householdName = householdName;
    }

    public String getHouseholdCreatedDate() {
        return householdCreatedDate;
    }

    public void setHouseholdCreatedDate(String householdCreatedDate) {
        this.householdCreatedDate = householdCreatedDate;
    }

    public String getHouseholdCode() {
        return householdCode;
    }

    public void setHouseholdCode(String householdCode) {
        this.householdCode = householdCode;
    }


    @Override
    public String toString() {
        return "Household{" +
                "id=" + id +
                ", householdUsername='" + householdUsername + '\'' +
                ", householdPassword='" + householdPassword + '\'' +
                ", householdName'" + householdName + '\'' +
                ", householdCreatedDate='" + householdCreatedDate + '\'' +
                ", householdCode='" + householdCode + '\'' +
                '}';

    }
}
