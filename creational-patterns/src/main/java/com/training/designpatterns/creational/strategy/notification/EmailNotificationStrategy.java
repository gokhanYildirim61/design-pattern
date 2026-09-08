package com.training.designpatterns.creational.strategy.notification;

import org.springframework.stereotype.Component;

@Component("EMAIL")
public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(String notification) {
        System.out.println("send to notification "+ notification + "with EMAIL");

    }
}
