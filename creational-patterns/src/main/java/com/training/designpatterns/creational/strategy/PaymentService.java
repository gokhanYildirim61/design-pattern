package com.training.designpatterns.creational.strategy;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@Service
public class PaymentService {
    private Map<String,PaymentStrategy> paymentStrategyMap = new HashMap<>();

    public PaymentService (Map<String , PaymentStrategy> paymentStrategy){
        this.paymentStrategyMap=paymentStrategy;
    }
    public void pay(String provider, double amount){
        PaymentStrategy strategy = paymentStrategyMap.get(provider.toUpperCase());
        if (strategy==null){
            throw new IllegalArgumentException("Desteklenmeyen ödeme birimi");
        }
        strategy.processPayment(amount);
    }
}
