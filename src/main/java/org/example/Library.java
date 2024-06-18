package org.example;
import java.util.Scanner;

import java.util.ArrayList;

public class Library {


    private ArrayList<Book> catalog;
    private ArrayList<Book> availableBooks;
    private ArrayList<Book> lendBooks;

    public Library(String userName) {
        super();

        this.catalog = new ArrayList<>();
        this.availableBooks = new ArrayList<>();
        this.lendBooks = new ArrayList<>();
    }
//getters and setters


    public ArrayList<Book> getCatalog() {

        return this.catalog;
    }

    public void setCatalog(ArrayList<Book> catalog) {

        this.catalog = catalog;
    }

    //methods

    //create methods
    public void addBook() {
        //si el libro ya está dentro, no dejar meterlo
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        String newAuthor = scanner.nextLine();
        String newTitle = scanner.nextLine();
        book.setAuthor(newAuthor);
        book.setTitle(newTitle);
        this.catalog.add(book);
    }
    //update methods
    public void borrowBooks() {
        System.out.println("These are the books available at the moment to loan.");
        this.showAvailableBooks();
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        Book wantToLoan = this.catalog.get(userChoice -1);
        if (wantToLoan.getIsAvailable()){
            getBorrowedBooks().add(wantToLoan);
            wantToLoan.setAvailable(false);
        }
        else{
            System.out.println("Sorry, that book is not available at the moment");
        }


    }
    public void returnBooks(){
        Scanner scanner = new Scanner(System.in);
        Users users = new Users();
        System.out.println("These are the books that you have in your possession.");
        checkBorrowedBooks();
        System.out.println("Which book would you like to return?");
        int userChoice = scanner.nextInt();
        Book bookToReturn = users.getBorrowedBooks().get(userChoice-1);
        getBorrowedBooks().remove(bookToReturn);
        bookToReturn.setAvailable(true);

    }
    //read methods
    public void showAllBooks() {
        for (Book b : this.catalog) {
            System.out.println(
                    b.getAuthor() + ": " + b.getTitle());
        }
    }
    public void showAvailableBooks() {
        for (Book b : this.catalog) {
            if (b.getIsAvailable()) {
                //availableBooks.add(b);
                System.out.println(b.getAuthor() + ": " + b.getTitle());
            }
        }
    }

        public void showLendBooks() {
            for (Book b : this.catalog) {
                if (!b.getIsAvailable()) {
                    //lendBooks.add(b);
                    System.out.println(b.getAuthor() + ": " + b.getTitle());
                }
            }
        }
        public void searchBooks(){}

        //remove methods
        public void removeBook(){
        for (Book b:catalog){
            catalog.remove(b);
        }
        }
}