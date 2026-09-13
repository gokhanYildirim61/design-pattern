package com.training.designpatterns.creational.factory.notification;

public class EmailNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Email send" + message);
    }
}
