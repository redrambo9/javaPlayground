package com.fundamentals.java.designpatterns.templatemethodpattern;

public abstract class PaymentFlow {
    public abstract void validateRequest();

    public abstract void calculateFee();

    public abstract void debitAmount();

    public abstract void creditAmount();

    //this is template method which defines order of steps to execute the task.
    //since it is final cannot be overridden
    public final void sendMoney() {
        //step 1
        validateRequest();

        //step 2
        debitAmount();

        //step 3
        calculateFee();

        //step 4
        creditAmount();
    }

}
