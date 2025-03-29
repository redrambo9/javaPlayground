package com.fundamentals.java.lesserknownfeatures.functionalinterfaces;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
