package com.training.designpatterns.creational.builder.computer;

public class Computer {
    private String cpu;
    private int ram;
    private String gpu;
    private int ssd;
    private boolean keyboard;
    private boolean mouse;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.gpu = builder.gpu;
        this.ssd = builder.ssd;
        this.keyboard = builder.keyboard;
        this.mouse = builder.mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", gpu='" + gpu + '\'' +
                ", ssd=" + ssd +
                ", keyboard=" + keyboard +
                ", mouse=" + mouse +
                '}';
    }

    public static class Builder {
        private String cpu;
        private int ram;
        private String gpu;
        private int ssd;
        private boolean keyboard;
        private boolean mouse;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder ssd(int ssd) {
            this.ssd = ssd;
            return this;
        }

        public Builder keyboard(boolean keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder mouse(boolean mouse) {
            this.mouse = mouse;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
