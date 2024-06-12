package org.example;

public class Book {
    private String title;   // Titulo del libro
    private String author;  //Autor del librogitm
    private boolean isAvailable;  //esta disponible?

    //Constructor
    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    // constructor opcional
    public Book() {
    }

     // getter and setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
     this.isAvailable = isAvailable;
    }
