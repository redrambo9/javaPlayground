package com.fundamentals.java.designpatterns.prototypepattern;

public class PrototypeEmployee implements Prototype {
    String name;
    private String dept;

    public PrototypeEmployee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    PrototypeEmployee() {

    }

    @Override
    public Prototype getClone() {
        return new PrototypeEmployee(name, dept);
    }
}
