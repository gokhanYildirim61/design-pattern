package com.training.designpatterns.creational.factory.payment;

public class IyzicoPayment implements PaymentService {
    @Override
    public void pay(Integer price) {
        System.out.println("Ödeme Iyzico service üzerindne alındı, Toplam Tutar " + price);
    }
}
