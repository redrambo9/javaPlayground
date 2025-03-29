package com.fundamentals.java.designpatterns.abstractfactorypattern.factories;

public class AbstractFactory {

    public static String getLuxuryFactory(){
        return "LuxuryFactory...";
    }
    public static String getOrdinaryFactory(){
        return "OrdinaryFactory...";
    }
    public static String getSuvFactory(){
        return "SuvFactory...";
    }
}
