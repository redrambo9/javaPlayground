package com.fundamentals.java.designpatterns.iteratordesignpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book(100, "A"),
                new Book(200, "B"));

        Library lib = new Library(books);
        Iterator iterator = lib.createIterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
