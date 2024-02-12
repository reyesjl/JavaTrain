package com.example;

public abstract class LibraryItem {
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;
    private boolean available; 

    public LibraryItem(String title, String author, String isbn, int publicationYear, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.available = available;
    }

    // Abstract method
    public abstract String getInfo();
    
    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isAvailable() {
        return available;
    }

    public String isAvailableString() {
        return available ? "Yes" : "No";
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}