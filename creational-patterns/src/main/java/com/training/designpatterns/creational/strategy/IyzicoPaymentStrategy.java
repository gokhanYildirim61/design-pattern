package com.training.designpatterns.creational.strategy;

import org.springframework.stereotype.Component;

@Component("IYZICO")
public class IyzicoPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println(" IYZICO API ile " + amount + " TL çekildi");
    }
}
