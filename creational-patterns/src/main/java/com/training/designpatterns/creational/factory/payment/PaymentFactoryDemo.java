package com.training.designpatterns.creational.factory.payment;

public class PaymentFactoryDemo {
    public static void main(String[] args ){
        PaymentService paymentService = PaymentFactory.createPaymentChannelType("Iyzico");
        paymentService.pay(150);
    }
}
