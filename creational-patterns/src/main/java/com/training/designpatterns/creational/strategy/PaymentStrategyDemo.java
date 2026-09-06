package com.training.designpatterns.creational.strategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class PaymentStrategyDemo {
    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(PaymentStrategyDemo.class, args);

        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.pay("IYZICO",2500);
        paymentService.pay("Paynet",3000);
    }
}
