package com.training.designpatterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();
        AppConfig appConfig1 = AppConfig.getInstance();

        appConfig1.setApplicationName(appConfig.getApplicationName());
        System.out.println(appConfig1.getApplicationName());


        if (appConfig1.getApplicationName().equals(appConfig.getApplicationName())){
            System.out.println(appConfig.getApplicationName());
        }
        if (appConfig1.getVersion().equals(appConfig.getVersion())){
            System.out.println(appConfig.getVersion());
        }
        System.out.println(appConfig==appConfig1);
    }
    }
