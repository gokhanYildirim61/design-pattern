package com.training.designpatterns.creational.strategy.notification;

import org.springframework.stereotype.Component;

@Component("SMS")
public class SmsNotificationStrategy implements NotificationStrategy{
    @Override
    public void sendNotification(String notification) {
        System.out.println("send to notification "+ notification + "with SMS");

    }
}
