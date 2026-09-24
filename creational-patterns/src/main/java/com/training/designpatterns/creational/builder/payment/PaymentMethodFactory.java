package com.training.designpatterns.creational.builder.payment;

public class PaymentMethodFactory {

    public PaymentBuilderFactory createBuilder(String paymentProvider) {
        if ("IYZICO".equalsIgnoreCase(paymentProvider)) {
            return new IyzicoBuilder();
        }

        if ("CREDIT_CARD".equalsIgnoreCase(paymentProvider)) {
            return new CreditCartBuilderFactory();
        }

        throw new IllegalArgumentException("Unsupported payment provider: " + paymentProvider);
    }
}
