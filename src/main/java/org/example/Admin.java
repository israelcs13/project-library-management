package org.example;



import java.util.ArrayList;

public class Admin extends Users{
    private ArrayList<Book> catalog;
    private ArrayList<Book> availableBooks;
    private ArrayList<Book> lendBooks;

    public Admin(ArrayList<Book> catalog) {
        this.catalog = new ArrayList<Book>();
        this.availableBooks = new ArrayList<Book>();
        this.lendBooks = new ArrayList<Book>();
    }
    //getters and setters


    public ArrayList<Book> getCatalog() {

        return catalog;
    }

    public void setCatalog(ArrayList<Book> catalog) {

        this.catalog = catalog;
    }
    //methods
    public void addBook(){
        Book book = new Book();
        //sc
        String newAuthor = scanner.nextLine();
        String newTitle = scanner.nextLine() ;
        book.setAuthor(newAuthor);
        book.setTitle(newTitle);
        this.catalog.add(book);
    }
    public void manageBookLoan(){
        //Book wantToLoan = catalog(userchoice);
        //check if book is avalaible
        // if (wantToLoan in availableBooks)
        //if (wantToLoan.isAvailable == true)

        //add book to user's borrowedBook list
        // borrowedBooks.add(wantToLoan)
        //set boolean isAvailable to false book.isAvailable = false;
        //wantToLoan.setIsAvailable(false)

    }
    public void listAvailableBooks(){
        for (Book b : this.catalog){
            if (b.getIsAvailable()){
                //availableBooks.add(b);
                System.out.println(b.getAuthor()+ ": " + b.getTitle());
            }
    }
        public void listLendBooks() {
            for (Book b : this.catalog) {
                if (!b.getIsAvailable()) {
                    //lendBooks.add(b);
                    System.out.println(b.getAuthor() + ": " + b.getTitle());
                }
            }
        }