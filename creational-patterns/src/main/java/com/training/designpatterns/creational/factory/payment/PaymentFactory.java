package com.training.designpatterns.creational.factory.payment;

import java.util.Locale;

public class PaymentFactory {
   public static PaymentService createPaymentChannelType(String channel){
       if (channel==null){
           System.out.println("Böyle bir ödeme kanalı yoktur");
           throw  new IllegalArgumentException();
       }
       return switch (channel.toUpperCase(Locale.ENGLISH)){
           case "IYZICO" -> new IyzicoPayment();
           case "CREDITCARD" -> new CreditCardPayment();
           default -> throw new IllegalArgumentException("Bilinmeyen kanal");
       };
   }
}
