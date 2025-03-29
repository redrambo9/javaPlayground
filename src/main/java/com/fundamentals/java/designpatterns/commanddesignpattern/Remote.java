package com.fundamentals.java.designpatterns.commanddesignpattern;

import java.util.Stack;

//Invoker
public class Remote {
    Command command;

    Stack<Command> commandHistory = new Stack<>();
    Remote() {

    }

    public void setCommand(Command command) {
        this.command = command;
        commandHistory.add(command);
    }

    public void pressButton() {
        command.execute();
    }
    public void undo(){
        if(!commandHistory.isEmpty()){
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
