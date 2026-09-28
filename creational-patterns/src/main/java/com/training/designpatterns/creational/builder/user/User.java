package com.training.designpatterns.creational.builder.user;

public class User {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }





    private User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }


    public static class Builder {
        private String name;
        private String surname;
        private int age;
        private String email;
        private String phone;

        public  Builder name (String name){
            this.name=name;
            return this;
        }

        public  Builder surname(String surname){
            this.surname=surname;
            return this;
        }

        public Builder age(int age){
            this.age=age;
            return this;
        }

        public Builder email(String email){
            this.email=email;
            return this;
        }

        public Builder phone(String phone){
            this.phone=phone;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
