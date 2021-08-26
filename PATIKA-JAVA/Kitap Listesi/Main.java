package com.kitapListesi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        List<Book> pageNums = new ArrayList<>();
        Map<String,String> bookNameAuthor = new HashMap<>();

        books.add(new Book("A",236,"AAAA","26/08/2021"));
        books.add(new Book("B",56,"BBBB", "26/08/2021"));
        books.add(new Book("C",75,"CCCC", "26/08/2021"));
        books.add(new Book("D",99,"DDDD", "26/08/2021"));
        books.add(new Book("E",152,"EEEE", "26/08/2021"));
        books.add(new Book("F",131,"FFFF", "26/08/2021"));
        books.add(new Book("G",88,"GGGG", "26/08/2021"));
        books.add(new Book("H",101,"HHHH", "26/08/2021"));
        books.add(new Book("I",179,"IIII", "26/08/2021"));
        books.add(new Book("J",64,"JJJJ", "26/08/2021"));

        books.forEach(book -> {
            bookNameAuthor.put(book.getName(),book.getAuthor());
        });
        for(String key : bookNameAuthor.keySet()) {
            System.out.println(key + " " + bookNameAuthor.get(key));
        }
        System.out.println("************");
        books.stream().filter(book -> book.getPageNumber() > 100).forEach(book -> pageNums.add(book));
        for(Book b : pageNums) {
            System.out.println(b.getName() + " -> " + b.getPageNumber() );
        }
    }

}
