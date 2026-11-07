package com.training.designpatterns.creational.strategy.payment;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component("PAYPAL")

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Ödeme Paypal ile alındı " + amount);
    }
}
