package com.training.designpatterns.creational.factory;

public class EmailNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Email send" + message);
    }
}
