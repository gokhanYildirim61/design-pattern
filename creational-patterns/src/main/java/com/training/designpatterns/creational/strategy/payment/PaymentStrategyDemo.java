package com.training.designpatterns.creational.strategy.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
@SpringBootApplication
public class PaymentStrategyDemo {
    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(PaymentStrategyDemo.class, args);

        ShoppingCart shoppingCart =context.getBean(ShoppingCart.class);
        shoppingCart.checkout("paypal", BigDecimal.valueOf(1000));
    }
}
