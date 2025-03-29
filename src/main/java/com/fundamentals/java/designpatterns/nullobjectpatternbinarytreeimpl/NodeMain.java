package com.fundamentals.java.designpatterns.nullobjectpatternbinarytreeimpl;

public class NodeMain {

    public static void main(String args[]) {
        Node root = new NodeImpl("A",
                new NodeImpl("B",
                        new NullNode(),
                        new NullNode()),
                new NullNode());

        System.out.println("Node Size :" + root.getSize());
        root.travel();
    }
}
