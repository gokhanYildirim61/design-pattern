package com.training.designpatterns.creational.builder.payment;

public class IyzicoBuilder implements PaymentBuilderFactory {

    private final PaymentMethod paymentMethod;

    public IyzicoBuilder() {
        this.paymentMethod = new PaymentMethod();
        this.paymentMethod.setProvider("IYZICO");
    }

    @Override
    public PaymentBuilderFactory setCardNumber(String cardNumber) {
        this.paymentMethod.setCardNumber(cardNumber);
        return this;
    }

    @Override
    public PaymentBuilderFactory setPrivateKey() {
        paymentMethod.setPrivateKey("IyzicoKey");
        return this;
    }

    @Override
    public PaymentBuilderFactory setThreeDSecure(boolean threeDSecure) {
        paymentMethod.setThreeDSecure(threeDSecure);
        return this;
    }

    @Override
    public PaymentMethod build() {
        return paymentMethod;
    }
}
