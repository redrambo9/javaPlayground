package com.fundamentals.java.designpatterns.nullobjectpatternbinarytreeimpl;

public class NodeImpl implements Node {

    private String name;
    private Node leftNode;
    private Node rightNode;

    public NodeImpl(String name, Node leftNode, Node rightNode) {
        this.name = name;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public Node getLeft() {
        return leftNode;
    }

    @Override
    public Node getRight() {
        return rightNode;
    }

    @Override
    public int getSize() {
        return 1 + leftNode.getSize() + rightNode.getSize();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void travel() {
        System.out.println(this.name);
        if (leftNode.getSize() > 0) {
            leftNode.travel();
        }
        if (rightNode.getSize() > 0) {
            rightNode.travel();
        }
    }
}
