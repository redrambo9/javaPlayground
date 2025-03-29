package com.fundamentals.java.designpatterns.nullobjectpatternbinarytreeimpl;

public class NullNode implements Node{
    @Override
    public Node getLeft() {
        return null;
    }

    @Override
    public Node getRight() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void travel() {
        // do nothing
    }
}
