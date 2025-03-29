package com.fundamentals.java.lesserknownfeatures.functionalinterfaces;

public class Client {
    public static void main(String[] args) {
        //Consumer
        consumer();
        //supplier
        supplier();
        //function
        function();
        //predicate
        predicate();

    }

    public static void consumer() {
        Consumer<Integer> consumer = (integerValue) -> {
            if (integerValue > 10) {
                System.out.println("Logging Value");
            }
        };
        consumer.accept(34);
        consumer.accept(9);
    }
    public static void supplier(){
        Supplier<String> supplier = ()->"Yes";
        System.out.println(supplier.get());
    }

    public static void function(){
        Function<Integer,String> integerToStringFunction = (number)->{
            return number.toString();
        };
        String str = integerToStringFunction.apply(45);
    }

    public static void predicate(){
        Predicate<Integer> isEven = (value)->{
            if(value%2 ==0){
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));
    }

}
