package com.fundamentals.java.lesserknownfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamFlatMapMethod {

    //flatMap is a transformational operation that "flattens" a stream
    // by replacing each value with a stream and then concatenating all the streams together.
    //  It's useful when you have a stream of collections and you want to create a stream of elements.
    //For instance, think of it as taking multiple lists and converting them into a single list.
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d", "e")
        );
        List<String> flatList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList); // Outputs [a, b, c, d, e]
        List<Integer> numOfList = new ArrayList<>();
    }
}
