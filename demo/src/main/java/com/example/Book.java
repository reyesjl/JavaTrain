package com.example;

public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, String isbn, int publicationYear, boolean available, String genre) {
        super(title, author, isbn, publicationYear, available);
        this.genre = genre;
    }

    @Override
    public String getInfo() {
       return "Book: " + getTitle() + 
       ", Author: " + getAuthor() + 
       ", ISBN: " + getIsbn() + 
       ", Published: " + getPublicationYear() + 
       ", Available: " + isAvailableString() + 
       ", Genre: " + genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
