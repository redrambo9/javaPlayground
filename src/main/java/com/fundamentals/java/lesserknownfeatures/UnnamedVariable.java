package com.fundamentals.java.lesserknownfeatures;

import java.util.PriorityQueue;

public class UnnamedVariable {

        public void print(){
            System.out.println("This is the print Method");
        }
        public static void main(String[] args) {
            //Only after Java 22
            //UnnamedVariable _ = new UnnamedVariable();
           // _.print();
        }
}
