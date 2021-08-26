package com.insuranceManagement;

import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(double price, Date beginningDate, Date expiryDate) {
        super(4, "Araba Sigortası", 40, beginningDate, expiryDate);
    }

    @Override
    public double calculate() {
        long day = getExpiryDate().getTime() - getBeginingDate().getTime();
        double price = getInsurancePrice()*day;
        return price;
    }
}
