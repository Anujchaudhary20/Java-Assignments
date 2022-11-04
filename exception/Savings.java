package com.exception;

public class Savings {
    long id;
    double balance;
    Savings(long id,double b)
    {
        this.id=id;
        this.balance=b;
    }
    double deposit(double m){
        this.balance=balance+m;
        return balance;
    }
    double withdraw(double m)
    {
        balance=balance-m;
        return balance;
    }
}