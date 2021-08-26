package com.insuranceManagement;

import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(double price, Date beginningDate, Date expiryDate) {
        super(1, "Sağlık Sigortası", 10, beginningDate, expiryDate);
    }

    @Override
    public double calculate() {
        long day = getExpiryDate().getTime() - getBeginingDate().getTime();
        double price = getInsurancePrice() * day;
        return price;
    }
}
