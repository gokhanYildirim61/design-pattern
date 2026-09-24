package com.training.designpatterns.creational.builder.payment;

public class BuilderPaymentDemo {

    public static void main(String[] args) {
        PaymentMethodFactory factory = new PaymentMethodFactory();

        PaymentMethod iyzicoPayment = factory.createBuilder("IYZICO")
                .setCardNumber("1111-2222-3333-4444")
                .setPrivateKey()
                .setThreeDSecure(true)
                .build();

        PaymentMethod creditCardPayment = factory.createBuilder("CREDIT_CARD")
                .setCardNumber("5555-6666-7777-8888")
                .setPrivateKey()
                .setThreeDSecure(false)
                .build();

        System.out.println(iyzicoPayment);
        System.out.println(creditCardPayment);
    }
}
