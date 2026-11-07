package com.training.designpatterns.creational.strategy.payment;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component("CRYPTO")
public class CryptoPayment implements PaymentStrategy{
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Ödeme crypto ile alındı " + amount);

    }
}
