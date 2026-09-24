package com.training.designpatterns.creational.builder.payment;

public interface PaymentBuilderFactory {

    PaymentBuilderFactory setCardNumber(String cardNumber);

    PaymentBuilderFactory setPrivateKey();

    PaymentBuilderFactory setThreeDSecure(boolean threeDSecure);

    PaymentMethod build();
}
