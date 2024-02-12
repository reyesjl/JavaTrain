package com.example;

import java.util.Scanner;

public class ListCommand implements Command {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        
        // Continue looping until a valid option is chosen
        while (true) {
            System.out.println("Which items would you like to list? Enter 'books' or 'dvds':");
            String choice = scanner.nextLine().trim().toLowerCase();
            
            switch (choice) {
                case "books":
                    listBooks();
                    return; // Exit the loop after listing books
                case "dvds":
                    listDvds();
                    return; // Exit the loop after listing DVDs
                default:
                    System.out.println("Invalid choice. Please enter 'books' or 'dvds'.");
                    break;
            }
        }
    }

    private void listBooks() {
        // Retrieve the library instance and get the catalog
        Library library = Library.getInstance("Expo Library");
        System.out.println("Listing books:");
        for (LibraryItem item : library.getCatalog()) {
            if (item instanceof Book) {
                System.out.println(((Book) item).getInfo());
            }
        }
    }

    private void listDvds() {
        // Retrieve the library instance and get the catalog
        Library library = Library.getInstance("Expo Library"); // Replace null with the actual library name
        System.out.println("Listing DVDs:");
        for (LibraryItem item : library.getCatalog()) {
            if (item instanceof Dvd) {
                System.out.println(((Dvd) item).getInfo());
            }
        }
    }
}
