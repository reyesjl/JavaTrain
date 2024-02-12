package com.example;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library("My Library");

        // Create some books
        LibraryItem book1 = new Book("Clean Code", "Robert C. Martin", "978-0132350884", 2008, true, "non-fiction");
        LibraryItem dvd1 = new Dvd("Terminator", "John Vlissides", "978-0201616224", 1994, true, "blueray");

        // Add items to the catalog
        library.addItem(book1);
        library.addItem(dvd1);

        // Create some patrons
        Patron patron1 = new Patron("P001", "Alice", 7.50);
        Patron patron2 = new Patron("P002", "Bob", 0.0);

        // Add patrons to the library
        library.getPatrons().add(patron1);
        library.getPatrons().add(patron2);

        // Display information about the library, books, and patrons
        System.out.println("Library Name: " + library.getName());
        System.out.println("Catalog:");
        for (LibraryItem item : library.getCatalog()) {
            System.out.println(item.getInfo());
        }
        System.out.println("Patrons:");
        for (Patron patron : library.getPatrons()) {
            System.out.println("- " + patron.getName() + " (ID: " + patron.getId() + ")");
        }

        // Example of borrowing an Item
        System.out.println("Example of borrowing a book:");
        Borrowing borrowing = new Borrowing(patron1, book1);
        Borrowing borrowing2 = new Borrowing(patron2, dvd1);

        borrowing.setDueDate(new Date()); // Set due date to current date
        borrowing2.setDueDate(new Date());

        library.getBorrowings().add(borrowing);
        library.getBorrowings().add(borrowing2);

        System.out.println("Book borrowed by " + borrowing.getPatron().getName() + ": " + borrowing.getItem().getTitle());
        System.out.println("Due Date: " + borrowing.getDueDate());

        System.out.println("DVD borrowed by " + borrowing2.getPatron().getName() + ": " + borrowing2.getItem().getTitle());
        System.out.println("Due Date: " + borrowing2.getDueDate());
    }
}
