package com.fundamentals.java.lesserknownfeatures;

public class Misc {

    //Underscores in Numeric Literals
    //Introduced in Java 7, this feature improves the readability of code
    // by allowing you to separate groups of digits in numeric literals with underscores.
    // This is particularly useful for large numbers like a million or a billion
    // where counting zeros can be error-prone.
    int one_million = 1_000_000;

    //Binary Literals
    //Before Java 7, integer literals were typically expressed in decimal or hexadecimal format.
    // With the introduction of binary literals, it’s now possible to express them directly
    // in binary format using the 0b or 0B prefix.
    int binary = 0b1011; // This is equal to decimal 11.
}
