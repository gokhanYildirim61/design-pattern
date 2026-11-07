package com.training.designpatterns.creational.strategy.payment;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component("CREDITCARD")
public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Ödeme kredi kartı ile alındı " + amount);
    }
}
