package com.fundamentals.java.designpatterns.commanddesignpattern;

public class TurnAcOffCommand implements Command{
    AirConditioner ac;
    TurnAcOffCommand(AirConditioner ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOffAc();
    }

    @Override
    public void undo() {
        ac.turnOnAc();
    }
}
