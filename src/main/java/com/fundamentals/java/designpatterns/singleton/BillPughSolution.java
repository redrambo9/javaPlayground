package com.fundamentals.java.designpatterns.singleton;

public class BillPughSolution {

    private BillPughSolution() {

    }

    private static class SingletonHelper {
        private static final BillPughSolution BILL_PUGH_SOLUTION = new BillPughSolution();
    }

    //here solution is nested class
    //nested classes are only loaded into memory only when they are used
    //not on application startup
    public static BillPughSolution getInstance() {
        return SingletonHelper.BILL_PUGH_SOLUTION;
    }
}
