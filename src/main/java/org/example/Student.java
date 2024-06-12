package org.example;
import java.util.ArrayList;
import java.util.Scanner;


public class Student extends Users{
    private ArrayList<Book> borrowedBooks;

    public Student(ArrayList<Book> borrowedBooks) {

        this.borrowedBooks = new Array<Book>[3];
    }
    //setters and getters

    public ArrayList<Book> getBorrowedBooks() {

        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }



}
