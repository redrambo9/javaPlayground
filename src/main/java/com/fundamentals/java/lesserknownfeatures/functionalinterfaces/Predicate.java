package com.fundamentals.java.lesserknownfeatures.functionalinterfaces;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
