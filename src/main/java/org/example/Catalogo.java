package org.example;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Scanner;



public class Catalogo {

    HashSet<Book> bookSet = new HashSet<>();
    Scanner scanner = new Scanner(System.in);


    public HashSet<Book> getBookSet() {
        return bookSet;
    }
}
}
