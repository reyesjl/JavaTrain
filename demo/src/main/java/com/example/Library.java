package com.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private String name;
    private List<LibraryItem> catalog;
    private List<Patron> patrons;

    // Private constructor to prevent instantiation from outside
    private Library(String name) {
        // Initialize lists
        this.name = name;
        this.catalog = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Static method to get the singleton instance
    public static Library getInstance(String name) {
        if (instance == null) {
            instance = new Library(name);
        }
        return instance;
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

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public Patron findPatronByName(String name) {
        for (Patron patron : patrons) {
            if (patron.getName().equalsIgnoreCase(name)) {
                return patron;
            }
        }
        return null;
    }

    public LibraryItem findItemByTitle(String title) {
        for (LibraryItem item : catalog) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    public void addItem(LibraryItem item) {
        catalog.add(item);
    }

    public void removeItem(LibraryItem item) {
        catalog.remove(item);
    }
}