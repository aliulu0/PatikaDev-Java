package com.insuranceManagement;

import java.util.Date;

public abstract class Insurance {
    private int id;
    private String insuranceName;
    private double insurancePrice;
    private Date beginingDate;
    private Date expiryDate;


    public Insurance(int id, String insuranceName, double insurancePrice, Date beginingDate, Date expiryDate) {
        this.id = id;
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.beginingDate = beginingDate;
        this.expiryDate = expiryDate;
    }
    public abstract double calculate();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Date getBeginingDate() {
        return beginingDate;
    }

    public void setBeginingDate(Date beginingDate) {
        this.beginingDate = beginingDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
