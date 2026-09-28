package com.training.designpatterns.creational.builder.computer;

import com.training.designpatterns.creational.builder.user.User;

public class Main {
    public static void main(String[] args ){
        Computer gamingComputer = new Computer.Builder()
                .cpu("Intel i7")
                .ram(32)
                .gpu("RTX 4070")
                .ssd(1000)
                .keyboard(true)
                .mouse(true)
                .build();

        Computer officeComputer = new Computer.Builder()
                .cpu("Intel i5")
                .ram(16)
                .ssd(512)
                .keyboard(true)
                .mouse(true)
                .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);


    }
}
