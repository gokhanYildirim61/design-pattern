package com.training.designpatterns.creational.builder.payment;

public class CreditCartBuilderFactory implements PaymentBuilderFactory {

    private final PaymentMethod paymentMethod;

    public CreditCartBuilderFactory() {
        this.paymentMethod = new PaymentMethod();
        this.paymentMethod.setProvider("CREDIT_CARD");
    }

    @Override
    public PaymentBuilderFactory setCardNumber(String cardNumber) {
        this.paymentMethod.setCardNumber(cardNumber);
        return this;
    }

    @Override
    public PaymentBuilderFactory setPrivateKey() {
        this.paymentMethod.setPrivateKey("CreditCardKey");
        return this;
    }

    @Override
    public PaymentBuilderFactory setThreeDSecure(boolean threeDSecure) {
        this.paymentMethod.setThreeDSecure(threeDSecure);
        return this;
    }

    @Override
    public PaymentMethod build() {
        return paymentMethod;
    }
}
