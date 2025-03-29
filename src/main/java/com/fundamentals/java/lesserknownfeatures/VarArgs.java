package com.fundamentals.java.lesserknownfeatures;

public class VarArgs {

    public static void main(String[] args) {
        int sum1 = calculateSum(1, 2, 3);
        int sum2 = calculateSum(10, 20, 30, 40, 50);

        System.out.println("Sum 1: " + sum1); // Output: Sum 1: 6
        System.out.println("Sum 2: " + sum2); // Output: Sum 2: 150
    }

    // This method takes a variable number of integers and calculates their sum.
    //called as variable arguments (varargs) in Java:
    private static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
