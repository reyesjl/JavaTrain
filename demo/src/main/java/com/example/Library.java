package com.example;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<LibraryItem> catalog;
    private List<Patron> patrons;
    private List<Borrowing> borrowings;

    // Constructor 
    public Library() {
        // Initialize lists
        this.catalog = new ArrayList<>();
        this.patrons = new ArrayList<>();
        this.borrowings = new ArrayList<>();
    }

    // Constructor with name
    public Library(String name) {
        this(); // call original constructor to initialize lists
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<LibraryItem> getCatalog() {
        return catalog;
    }

    public List<Patron> getPatrons() {
        return patrons;
    }

    public List<Borrowing> getBorrowings() {
        return borrowings;
    }

    public void addItem(LibraryItem item) {
        catalog.add(item);
    }

    public void removeItem(LibraryItem item) {
        catalog.remove(item);
    }
}