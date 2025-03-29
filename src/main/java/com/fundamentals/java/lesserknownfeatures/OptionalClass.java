package com.fundamentals.java.lesserknownfeatures;

import java.util.Optional;

//Java’s Optional is a container object that may or may not contain a non-null value.
// Instead of returning null for methods, one can return an Optional to better signify
// that a value might be absent.
//It includes various utility methods for conditional actions, such as ifPresent, orElse, and map.
public class OptionalClass {

    public Optional<String> findUsernameById(int id) {
        // let's assume a database lookup
        if (id == 123) return Optional.of("Alice");
        else return Optional.empty();
    }
}
