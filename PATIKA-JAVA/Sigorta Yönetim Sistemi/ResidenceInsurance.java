package com.insuranceManagement;

import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(double price, Date beginningDate, Date expiryDate) {
        super(2, "Konut Sigortası", 20, beginningDate, expiryDate);
    }

    @Override
    public double calculate() {
        long day = getExpiryDate().getTime() - getBeginingDate().getTime();
        double price = getInsurancePrice()*day;
        return price;
    }
}
