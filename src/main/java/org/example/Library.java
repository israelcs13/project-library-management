package org.example;
import java.util.ArrayList;

public class Library {

private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void searchBooks() {
        System.out.println("Do you want to search by title(T), author(A), genre(G) or those you have available(O)?");
        String optionSearch  = scanner.nextLine();
        switch () {
            case "T":
                private void showTitles() {
                System.out.println("Available titles:");
                for (Book book : books)
                    System.out.println(book.getTitle());
            }
            break;
            case "A":
                private void showAuthors() {
                System.out.println("Available authors:");
                for (Book book : books)
                    System.out.println(book.getAuthors());

                System.out.println("Which author do you choose to see their books?");
                String optionAuthor = scanner.nextLine();
                System.out.println(System.out.println("Books by " + optionAuthor + ":");
                for (Book book : books) {
                    if (book.getAuthor().equalsoptionAuthor() {
                        System.out.println(book);
                    })
                }
            }
            break;
            case "G":
                private void showGenres() {
                System.out.println("Available genres:");
                for (Book book : books)
                    System.out.println(book.getGenres());

                System.out.println("What genre do you want to see the books?");
                String optionGenre = scanner.nextLine();
                System.out.println(System.out.println("Books by " + optionGenre + ":");
                for (Book book : books) {
                    if (book.getGenre().equalsoptionGenre() {
                        System.out.println(book);
                    })
                }
            }
            break;
    }
}
