package com.fundamentals.java.designpatterns.commanddesignpattern;

public class Client {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOnAc();;
        ac.setTemperature(24);
        ac.turnOffAc();

        System.out.println("After Applying Solution");
        solution();

        System.out.println("After Undo Redo Feature");
        undoRedoSolution();

    }
    //Problem with this implementation
    //1. Lack of abstraction
    //today turning ac on off steps are simple, tomorrow they might get change
    //so client also affected, which is not good

    //2. Undo/Redo Functionality
    //How will you implement the undo/redo functionality
    //Like in case client want to undo/redo the command then who will do that, client have to keep track the previous commands in order to undo ?

    //3.Difficulty in code maintenance

    //Solution is :
    public static void solution(){
        AirConditioner ac = new AirConditioner();

        Remote remote = new Remote();
        remote.setCommand(new TurnAcOffCommand(ac));
        remote.pressButton();
    }

    // how to implement the undo/redo functionality
    // add a undo method in Command interface which will do reverse of what happens in execute();
    // use stack in invoker (remote) to keep history of last command

    public static void undoRedoSolution(){
        AirConditioner ac = new AirConditioner();

        Remote remote = new Remote();
        remote.setCommand(new TurnAcOffCommand(ac));
        remote.pressButton();

        //undo
        remote.undo();
    }
}
