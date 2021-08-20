package com.collection;

import java.time.LocalDate;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        /*
        TreeSet<Book> booksName = new TreeSet<Book>();


        booksName.add(new Book("A",10,"AA", LocalDate.parse("2021-08-20")));
        booksName.add(new Book("K",20,"BB", LocalDate.parse("2021-08-20")));
        booksName.add(new Book("E",30,"CC", LocalDate.parse("2021-08-20")));
        booksName.add(new Book("M",40,"DD", LocalDate.parse("2021-08-20")));
        booksName.add(new Book("C",50,"ZZ", LocalDate.parse("2021-08-20")));

        for (Book b : booksName){
            System.out.println(b.getName());
        }

         */
        TreeSet<Book> booksPage = new TreeSet<Book>();

        booksPage.add(new Book("A",110,"AA", LocalDate.parse("2021-08-20")));
        booksPage.add(new Book("K",120,"BB", LocalDate.parse("2021-08-20")));
        booksPage.add(new Book("E",90,"CC", LocalDate.parse("2021-08-20")));
        booksPage.add(new Book("M",201,"DD", LocalDate.parse("2021-08-20")));
        booksPage.add(new Book("C",95,"ZZ", LocalDate.parse("2021-08-20")));

        for (Book b : booksPage) {
            System.out.println(b.getPageNumber());
        }

    }
}
