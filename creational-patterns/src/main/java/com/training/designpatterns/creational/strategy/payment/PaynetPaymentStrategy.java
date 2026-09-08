package com.training.designpatterns.creational.strategy.payment;

import org.springframework.stereotype.Component;

@Component("PAYNET")
public class PaynetPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println(" PAYNET ile " + amount + " Tl çekildi");
    }
}
