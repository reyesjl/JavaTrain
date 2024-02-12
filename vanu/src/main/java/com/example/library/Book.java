package com.example.library;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;
    private boolean available; 

    public Book(String title, String author, String isbn, int publicationYear, boolean avaiable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
