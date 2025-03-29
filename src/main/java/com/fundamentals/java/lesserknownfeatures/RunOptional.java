package com.fundamentals.java.lesserknownfeatures;

public class RunOptional {
    public static void main(String[] args) {

        OptionalClass optionalClass = new OptionalClass();
        optionalClass.findUsernameById(123).ifPresent(name -> System.out.println("Name found: " + name));
    }
}
