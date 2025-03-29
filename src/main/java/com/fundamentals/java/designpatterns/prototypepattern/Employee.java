package com.fundamentals.java.designpatterns.prototypepattern;

public class Employee {
    String name;
    private String dept;

    Employee() {

    }

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}
