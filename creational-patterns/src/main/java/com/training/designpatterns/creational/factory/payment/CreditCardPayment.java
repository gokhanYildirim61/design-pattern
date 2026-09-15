package com.training.designpatterns.creational.factory.payment;

public class CreditCardPayment implements PaymentService{
    @Override
    public void pay(Integer price) {
        System.out.println("Ödeme CreditCard service üzerindne alındı, Toplam Tutar " + price);

    }
}
