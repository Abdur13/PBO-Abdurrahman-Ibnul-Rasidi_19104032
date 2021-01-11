package com.Abdur.Praktikum3.Komposisi;

public class Computer {
    private String Type;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private Cpu cpu;

    public Computer(String Type){this.Type = Type;}

    public void addComponent(Keyboard keyboard,Mouse mouse,Monitor monitor,Cpu cpu){
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.cpu = cpu;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
