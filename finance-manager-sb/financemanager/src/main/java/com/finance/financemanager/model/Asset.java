package com.finance.financemanager.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
public class Asset implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable= false, updatable = false)
    private Long id;
    private Long userId;
    private String assetName;
    private String assetType;
    private Number assetAmount;
    private Number assetGoalAmount;
    private String assetGoalDeadline;
    private Number assetGoalProgress;
    @Column(nullable= false, updatable = false)
    private String assetCode;

    public Asset() {}

    public Asset(Long userId, String assetName, String assetType, Number assetAmount, Number assetGoalAmount, String assetGoalDeadline, Number assetGoalProgress, String assetCode) {
        this.userId = userId;
        this.assetName = assetName;
        this.assetType = assetType;
        this.assetAmount = assetAmount;
        this.assetGoalAmount = assetGoalAmount;
        this.assetGoalDeadline = assetGoalDeadline;
        this.assetGoalProgress = assetGoalProgress;
        this.assetCode = assetCode;
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

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public Number getAssetAmount() {
        return assetAmount;
    }

    public void setAssetAmount(Number assetAmount) {
        this.assetAmount = assetAmount;
    }

    public Number getAssetGoalAmount() {
        return assetGoalAmount;
    }

    public void setAssetGoalAmount(Number assetGoalAmount) {
        this.assetGoalAmount = assetGoalAmount;
    }

    public String getAssetGoalDeadline() {
        return assetGoalDeadline;
    }

    public void setAssetGoalDeadline(String assetGoalDeadline) {
        this.assetGoalDeadline = assetGoalDeadline;
    }


    public Number getAssetGoalProgress() {
        return assetGoalProgress;
    }

    public void setAssetGoalProgress(Number assetGoalProgress) {
        this.assetGoalProgress = assetGoalProgress;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", assetName='" + assetName + '\'' +
                ", assetType='" + assetType + '\'' +
                ", assetAmount='" + assetAmount + '\'' +
                ", assetGoalAmount='" + assetGoalAmount + '\'' +
                ", assetGoalDeadline='" + assetGoalDeadline + '\'' +
                ", assetGoalProgress='" + assetGoalProgress + '\'' +
                ", assetCode='" + assetCode + '\'' +
                '}';

    }





}
