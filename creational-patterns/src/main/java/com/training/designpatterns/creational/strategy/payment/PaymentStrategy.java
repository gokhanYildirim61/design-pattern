package com.training.designpatterns.creational.strategy.payment;

import java.math.BigDecimal;

public interface PaymentStrategy {

    void  pay(BigDecimal amount);
}
