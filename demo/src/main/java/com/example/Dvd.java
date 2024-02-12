package com.example;

public class Dvd extends LibraryItem {
    private String cdType;

    public Dvd(String title, String author, String isbn, int publicationYear, boolean available, String cdType) {
        super(title, author, isbn, publicationYear, available);
        this.cdType = cdType;
    }

    @Override
    public String getInfo() {
       return "DVD: " + getTitle() + ", Author: " + getAuthor() + ", ISBN: " + getIsbn() + ", Published: " + getPublicationYear() + ", Available: " + isAvailableString() + ", CD Type: " + cdType;
    }

    public String getCdType() {
        return cdType;
    }

    public void setCdType(String cdType) {
        this.cdType = cdType;
    }
}
