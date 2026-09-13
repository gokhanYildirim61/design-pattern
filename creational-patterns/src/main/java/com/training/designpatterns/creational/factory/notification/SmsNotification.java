package com.training.designpatterns.creational.factory.notification;

public class SmsNotification implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("sms send"+ message);
    }
}
