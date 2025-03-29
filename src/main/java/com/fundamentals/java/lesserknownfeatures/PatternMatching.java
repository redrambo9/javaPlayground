package com.fundamentals.java.lesserknownfeatures;

public class PatternMatching {

    //Introduced as a preview feature in Java 14 and later finalized,
    // it enhances the instanceof operator to eliminate the need for an explicit cast
    // after a successful instanceof check.

    public static void main(String[] args) {

    }

    private void patternMatchingBeforeJava16() {
        Object obj = "Hello";
        if (obj instanceof String) {
            System.out.println(((String) obj).toLowerCase());
        }
    }

    private void patternMatchingAfterJava16() {
        Object obj = "Hello";
        if (obj instanceof String str) {
            System.out.println(str.toLowerCase());
        }
    }
}
