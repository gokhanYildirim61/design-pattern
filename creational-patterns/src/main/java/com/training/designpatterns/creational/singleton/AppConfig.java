package com.training.designpatterns.creational.singleton;

public class AppConfig {
    private  String applicationName;
    private final String version;

    private AppConfig() {
        this.applicationName = "Design Patterns Training";
        this.version = "1.0.0";
    }
    private  static class Holder{
        private static final  AppConfig INSTANCE = new AppConfig();
    }

    public static AppConfig getInstance() {
        return Holder.INSTANCE;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getVersion() {
        return version;
    }

    public void setApplicationName(String name){
        applicationName = name;
    }
}
