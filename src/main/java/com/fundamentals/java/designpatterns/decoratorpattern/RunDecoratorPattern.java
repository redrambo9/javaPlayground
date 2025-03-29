package com.fundamentals.java.designpatterns.decoratorpattern;

public class RunDecoratorPattern {
    public static void printInfo(Tea tea) {
        // Prints output by calling getPrice(), getContents()
        System.out.println("Content: " + tea.getContents() + "\nPrice : " + tea.getPrice());
    }

    public static void main(String[] args) {
        Tea tea = new NormalTea();
        printInfo(tea); // Prints 'Price: 1.0, Contents: Tea'

        tea = new WithIce(tea);
        printInfo(tea); // Prints 'Price: 1.2, Contents: Tea with Ice'
    }

}
