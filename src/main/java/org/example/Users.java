package org.example;


import java.util.ArrayList;

public class Users {


    private String userName;
    private ArrayList<Book> borrowedBooks;


    public Users(String userName) {
        this.userName = userName;
        this.borrowedBooks = borrowedBooks;

    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks() {
        this.borrowedBooks = borrowedBooks;
    }


    public void checkBorrowedBooks() {
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle() + book.getAuthor());

        }
    }

}
