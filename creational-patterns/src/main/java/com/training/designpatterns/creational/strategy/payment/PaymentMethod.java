package com.training.designpatterns.creational.strategy.payment;

public enum PaymentMethod {

    CREDIT_CART("CREDITCARD"),
    PAYPAL("PAYPAL"),
    CRYPTO("CRYPTO");


    private final String value;

    PaymentMethod(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
