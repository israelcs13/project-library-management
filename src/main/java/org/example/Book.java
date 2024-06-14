package org.example;

public class Book {
    private String title;   // Titulo del libro
    private String author;
    private String genre;//Autor del librogitm
    private boolean isAvailable;  //esta disponible?

    //Constructor
    public Book(String title, String author, String genre, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre= genre;
        this.isAvailable = true;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
     this.isAvailable = isAvailable;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
