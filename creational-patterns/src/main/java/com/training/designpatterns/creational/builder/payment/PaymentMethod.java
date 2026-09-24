package com.training.designpatterns.creational.builder.payment;

public class PaymentMethod {

    private String provider;

    private String cardNumber;

    private String privateKey;

    private boolean threeDSecure;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public boolean isThreeDSecure() {
        return threeDSecure;
    }

    public void setThreeDSecure(boolean threeDSecure) {
        this.threeDSecure = threeDSecure;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "provider='" + provider + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", privateKey='" + privateKey + '\'' +
                ", threeDSecure=" + threeDSecure +
                '}';
    }
}
