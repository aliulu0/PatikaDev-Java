package com.insuranceManagement;

import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(int id,double price, Date beginningDate, Date expiryDate) {
        super(id, "Seyahat Sigortası", 30, beginningDate, expiryDate);

    }


    @Override
    public double calculate() {
        long day = getExpiryDate().getTime() - getBeginingDate().getTime();
        double price = getInsurancePrice()*day;
        return price;
    }
}
