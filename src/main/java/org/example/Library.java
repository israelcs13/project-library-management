package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> books;
    private Scanner scanner;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    this.scanner = new Scanner(System.in);

    public void searchBooks() {
        System.out.println("Do you want to search by title(T), author(A), genre(G) or those you have available(O)?");
        String optionSearch  = scanner.nextLine();
        switch(optionSearch) {
            case "T":
                showTitle();
            break;
            case "A":
                showAuthor();
            break;
            case "G":
                showGenre();
            break;
            case "O":
                showIsAvailable();
            break;
            default:
                System.out.println("Invalid search.");
                break;
    }
        private void showTitle() {
            System.out.println("Available titles:");
            for (Book book : books)
                System.out.println(book.getTitle());
        }
        private void showAuthor() {
            System.out.println("Available authors:");
            for (Book book : books)
                System.out.println(book.getAuthor());

            System.out.println("Which author do you choose to see their books?");
            String optionAuthor = scanner.nextLine();
            System.out.println(System.out.println("Books by " + optionAuthor + ":");
            for (Book book : books) {
                if (book.getAuthor().equals(optionAuthor)) {
                    System.out.println(book);
                }
            }
        }
        private void showGenres() {
            System.out.println("Available genres:");
            for (Book book : books)
                System.out.println(book.getGenre());

            System.out.println("What genre do you want to see the books?");
            String optionGenre = scanner.nextLine();
            System.out.println(System.out.println("Books by " + optionGenre + ":");
            for (Book book : books) {
                if (book.getGenre().equals(optionGenre)) {
                    System.out.println(book);
                }
            }
        }
        private void showIsAvailable(){
            System.out.println("Books available:");
            for (Book book : books) {
                System.out.println(book.isAvailable());
            }
        }
}
