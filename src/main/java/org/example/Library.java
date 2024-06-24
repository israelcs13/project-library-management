package org.example;
import java.util.ArrayList;
import java.util.Scanner;


 public class Library {

    private ArrayList<Book> books;
    private ArrayList<Book> availableBooks;
    private ArrayList<Book> lendBooks;
    private ArrayList<Book> borrowedBooks;

    private Scanner scanner;


  public Library() {
       this.books = new ArrayList<Book>();;
       this.availableBooks = new ArrayList<Book>();
       this.lendBooks = new ArrayList<Book>();
       this.scanner = new Scanner(System.in);
       this.borrowedBooks = new ArrayList<Book>();
   }

//read methods

        private void showTitle() {
            System.out.println("Available titles:");
            for (Book book : books)
                System.out.println(book.getTitle());
        }
        private void showAuthor() {

            for (Book book : books)
                System.out.println("Available authors: " + book.getAuthor());
                System.out.println("Which author do you choose to see their books?");
                String optionAuthor = scanner.nextLine();
                System.out.println("Books by " + optionAuthor + ":");
                for (Book book : books) {
                    if (book.getAuthor().equals(optionAuthor)) {
                        System.out.println(book);
                    }
                }
            }
        private void showGenre() {
            System.out.println("Available genres:");
            for (Book book : books)
                System.out.println(book.getGenre());
             System.out.println("What genre do you want to see the books?");
            String optionGenre = scanner.nextLine();
            System.out.println("Books by " + optionGenre + ":");
            for (Book book : books) {
                if (book.getGenre().equals(optionGenre)) {
                    System.out.println(book);
                }
            }
        }
        private void showIsAvailable() {
            System.out.println("Books available:");
            for (Book book : books) {
                if (book.getIsAvailable()) {
                     //availableBooks.add(b);
                    System.out.println(book.getAuthor() + " : " + book.getTitle());

                }
            }
        }
    public void checkBorrowedBooks() {
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle() + book.getAuthor());

        }
    }

    //read methods


    //create methods
    public void addBook() {
        //si el libro ya está dentro, no dejar meterlo
        Book book = new Book();
        System.out.println("Add the book's author: ");
        String newAuthor = scanner.nextLine();
        System.out.println("Add the book's title: ");
        String newTitle = scanner.nextLine();
        System.out.println("Add the book's genre: ");
        String newGenre = scanner.nextLine();
        book.setAuthor(newAuthor);
        book.setTitle(newTitle);
        book.setGenre(newGenre);
        this.books.add(book);
    }



    public void showAllBooks() {
      //add: if not books, return "No books"
        System.out.println("All books in the library:");
        for (Book book : this.books) {
            System.out.println(book.getAuthor() + ": " + book.getTitle());
        }
    }
    //update methods
    public void borrowBooks() {
            System.out.println("These are the books available at the moment to loan.");
            this.showIsAvailable();
            System.out.println("Which book do you want to borrow?");
            int choice = scanner.nextInt();
            Book wantToLoan = this.books.get(choice - 1);
            if (wantToLoan.getIsAvailable()) {
                borrowedBooks.add(wantToLoan);
                wantToLoan.setAvailable(false);
            } else {
                System.out.println("Sorry, that book is not available at the moment");
        }
    }
    public void returnBooks(){
        System.out.println("These are the books that you have in your possession.");
        checkBorrowedBooks();
        System.out.println("Which book would you like to return?");
        int choice = scanner.nextInt();
        Book bookToReturn = borrowedBooks.get(choice-1);
        borrowedBooks.remove(bookToReturn);
        bookToReturn.setAvailable(true);

    }
        public void showLendBooks() {
            for (Book b : this.books) {
                if (!b.getIsAvailable()) {
                    //lendBooks.add(b);
                    System.out.println(b.getAuthor() + ": " + b.getTitle());
                }
            }
        }

        //remove methods
        public void removeBook() {
            System.out.println("Enter the title of the book you want to remove:");
            String titleToRemove = scanner.nextLine();

            boolean found = false;
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(titleToRemove)) {
                    books.remove(book);
                    found = true;
                    System.out.println("Book removed successfully.");
                    break;  // Exit the loop once the book is found and removed
                }
            }

            if (!found) {
                System.out.println("Book not found in the library.");
            }
        }
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

    }

   //getters and setters

   public ArrayList<Book> getBorrowedBooks() {
       return borrowedBooks;
   }

   public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
       this.borrowedBooks = borrowedBooks;
   }

}