package com.finance.financemanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class User implements Serializable {

    // TODO: ADD PROPERTIES FOR USERNAME & PASSWORD AFTER IMPLEMENTING AUTHENTICATION/LOGIN
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable= false, updatable = false)
    private Long id;
    private String userFirstName;
    private String userLastName;
    private Long userHouseholdId;
    private String userEmailAddress;
    private String userPhoneNumber;
    private String userProfileImageUrl;
    private String userEmployer;
    private String userJobTitle;
    private Number userAnnualSalary;
    private Number userAnnualBonusIncome;
    private String userStateOfResidence;
    private Number userCreditScore;
    private String userDateJoined;

    @Column(nullable= false, updatable = false)
    private String userCode;

    public User() {}

    public User(Long userHouseholdId,
                String userFirstName,
                String userLastName,
                String userEmailAddress,
                String userPhoneNumber,
                String userProfileImageUrl,
                String userEmployer,
                String userJobTitle,
                Number userAnnualSalary,
                Number userAnnualBonusIncome,
                String userStateOfResidence,
                Number userCreditScore,
                String userDateJoined,
                String userCode) {
        this.userHouseholdId = userHouseholdId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmailAddress = userEmailAddress;
        this.userPhoneNumber = userPhoneNumber;
        this.userProfileImageUrl = userProfileImageUrl;
        this.userEmployer = userEmployer;
        this.userJobTitle = userJobTitle;
        this.userAnnualSalary = userAnnualSalary;
        this.userAnnualBonusIncome = userAnnualBonusIncome;
        this.userStateOfResidence = userStateOfResidence;
        this.userCreditScore = userCreditScore;
        this.userDateJoined = userDateJoined;
        this.userCode = userCode;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getUserHouseholdId() { return userHouseholdId; }

    public void setUserHouseholdId(Long userHouseholdId) { this.userHouseholdId = userHouseholdId; }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    public void setUserEmailAddress(String userEmailAddress) {
        this.userEmailAddress = userEmailAddress;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserProfileImageUrl() {
        return userProfileImageUrl;
    }

    public void setUserProfileImageUrl(String userProfileImageUrl) {
        this.userProfileImageUrl = userProfileImageUrl;
    }

    public String getUserEmployer() {
        return userEmployer;
    }

    public void setUserEmployer(String userEmployer) {
        this.userEmployer = userEmployer;
    }

    public String getUserJobTitle() {
        return userJobTitle;
    }

    public void setUserJobTitle(String userJobTitle) {
        this.userJobTitle = userJobTitle;
    }

    public Number getUserAnnualSalary() {
        return userAnnualSalary;
    }

    public void setUserAnnualSalary(Number userAnnualSalary) {
        this.userAnnualSalary = userAnnualSalary;
    }

    public Number getUserAnnualBonusIncome() {
        return userAnnualBonusIncome;
    }

    public void setUserAnnualBonusIncome(Number userAnnualBonusIncome) {
        this.userAnnualBonusIncome = userAnnualBonusIncome;
    }

    public String getUserStateOfResidence() {
        return userStateOfResidence;
    }

    public void setUserStateOfResidence(String userStateOfResidence) {
        this.userStateOfResidence = userStateOfResidence;
    }


    public Number getUserCreditScore() {
        return userCreditScore;
    }

    public void setUserCreditScore(Number userCreditScore) {
        this.userCreditScore = userCreditScore;
    }

    public String getUserDateJoined() {
        return userDateJoined;
    }

    public void setUserDateJoined(String userDateJoined) {
        this.userDateJoined = userDateJoined;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userHouseholdId='" + userHouseholdId + '\'' +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userEmailAddress='" + userEmailAddress + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userProfileImageUrl='" + userProfileImageUrl + '\'' +
                ", userEmployer='" + userEmployer + '\'' +
                ", userJobTitle='" + userJobTitle + '\'' +
                ", userAnnualSalary='" + userAnnualSalary + '\'' +
                ", userAnnualBonusIncome='" + userAnnualBonusIncome + '\'' +
                ", userStateOfResidence='" + userStateOfResidence + '\'' +
                ", userCreditScore='" + userCreditScore + '\'' +
                ", userDateJoined='" + userDateJoined + '\'' +
                ", userCode='" + userCode + '\'' +
                '}';

    }


}
