package com.fundamentals.java.designpatterns.interpreterpattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> contextMap = new HashMap<>();

    public void put(String stringVariable, int intValue) {
        contextMap.put(stringVariable, intValue);
    }

    public int get(String stringVariable) {
        return contextMap.get(stringVariable);
    }
}
