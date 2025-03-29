package com.fundamentals.java.designpatterns.commanddesignpattern;


//Receiver
public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAc() {
        isOn = true;
        System.out.println("AC is On");
    }

    public void turnOffAc() {
        isOn = false;
        System.out.println("AC is off");
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("Temperature changed to " + temperature);
    }
}
