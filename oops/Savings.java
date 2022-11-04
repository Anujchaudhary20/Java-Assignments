package com.oops;

public class Savings extends Bank{
    float interestRate;
    float years;
    float amount;
    public Savings (float i,float y, float r) {
        interestRate=i;
        years=y;
        amount=r;
    }
    public float totalamount() {
        float FixedDeposit= interestRate*years*amount;
        return FixedDeposit;
    }



}