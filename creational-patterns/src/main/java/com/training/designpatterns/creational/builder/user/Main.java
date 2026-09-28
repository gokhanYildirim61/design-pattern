package com.training.designpatterns.creational.builder.user;

public class Main {
    public static void main(String[] args ){
        User user = new User.Builder().name("ali").surname("yılmaz").age(61).email("test@mail").phone("23123123123").build();
        System.out.println(user);

    }
}
