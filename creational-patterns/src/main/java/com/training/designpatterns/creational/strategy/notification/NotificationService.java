package com.training.designpatterns.creational.strategy.notification;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {

    private final Map<String,NotificationStrategy> notificationStrategyMap;

    public NotificationService(Map<String ,NotificationStrategy> notificationStrategy) {
        this.notificationStrategyMap=notificationStrategy;
    }

    public void send(String type,String message){
        NotificationStrategy strategy = notificationStrategyMap.get(type);
        strategy.sendNotification(message);
    }
}
