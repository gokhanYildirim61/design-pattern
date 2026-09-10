package com.training.designpatterns.creational.strategy.export;

import com.training.designpatterns.creational.strategy.notification.NotificationDemo;
import com.training.designpatterns.creational.strategy.notification.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class ExportStrategyDemo {
    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(ExportStrategyDemo.class, args);

        ExportService exportStrategy = context.getBean(ExportService.class);
        exportStrategy.exportData("EXCEL","DENEME");
    }
}
