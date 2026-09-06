package com.training.designpatterns.creational.factory;



public class NotificationFactory {
    public  static NotificationService createNotificationService(String channel){
        if (channel ==null || channel.isEmpty()){
            return null;
        }
        return switch (channel.toUpperCase()) {
            case "SMS" -> new SmsNotification();
            case "EMAIL" -> new EmailNotification();
            default -> throw new IllegalArgumentException("Bilinmeyen Kanal");
        };
    }
}
