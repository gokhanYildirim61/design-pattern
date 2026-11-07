package com.training.designpatterns.creational.strategy.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;

@Service
public class ShoppingCart {

    @Autowired
    Map<String,PaymentStrategy> paymentStrategyMap ;



    public void checkout(String paymentType, BigDecimal amount){
        PaymentStrategy paymentStrategy = paymentStrategyMap.get(paymentType.toUpperCase());
        String deneme = paymentType.toUpperCase();
        System.out.println(deneme);
        if (paymentStrategy ==null){
            throw  new IllegalArgumentException("Ödeme type bulunamadı");

        }
        paymentStrategy.pay(amount);


    }

}
