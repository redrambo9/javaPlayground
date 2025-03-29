package com.fundamentals.java.lesserknownfeatures.functionalinterfaces;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
