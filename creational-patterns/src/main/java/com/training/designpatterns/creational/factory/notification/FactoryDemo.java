package com.training.designpatterns.creational.factory.notification;

public class FactoryDemo {
    public static void main(String[] args) {
        // İstemci (Client) somut sınıfları bilmez, sadece interface ile çalışır
        NotificationService notification = NotificationFactory.createNotificationService("EMAIL");
        notification.send("Siparişiniz kargoya verildi.");
    }
}
