package com.fundamentals.java.lesserknownfeatures.lambda;

public class Lambda {

    public static void main(String[] args) {
        //Lambda expression is always : (parameters) -> expressions
        MathOperation operation = (a, b) -> a + b;
        System.out.println("Operation :" + operation.operate(5, 3));


        Print print = (input) -> {

            System.out.println(input);
        };
        print.print("Printing.....");
        //this is also right if you have only one statement then no need
        //of curly braces
        Print print2 = (input) -> System.out.println(input);
        print2.print("Printing");
    }
}
