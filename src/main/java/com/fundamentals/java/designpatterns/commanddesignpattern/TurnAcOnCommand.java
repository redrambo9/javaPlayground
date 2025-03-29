package com.fundamentals.java.designpatterns.commanddesignpattern;

public class TurnAcOnCommand implements Command {
    AirConditioner ac;

    TurnAcOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAc();
    }

    @Override
    public void undo() {
        ac.turnOffAc();
    }
}
