package com.training.designpatterns.creational.strategy.notification;

import com.training.designpatterns.creational.strategy.payment.PaymentService;
import com.training.designpatterns.creational.strategy.payment.PaymentStrategyDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class NotificationDemo {
    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(NotificationDemo.class, args);

        NotificationService notificationService = context.getBean(NotificationService.class);
        notificationService.send("SMS","DENEME");
        notificationService.send("EMAIL","DENEME");
    }
}
