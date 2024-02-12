package com.example;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library("My Library");

        // Create some books
        Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0132350884", 2008, true);
        Book book2 = new Book("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "978-0201616224", 1994, true);

        // Add books to the library
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        // Create some patrons
        Patron patron1 = new Patron("P001", "Alice", 7.50);
        Patron patron2 = new Patron("P002", "Bob", 0.0);

        // Add patrons to the library
        library.getPatrons().add(patron1);
        library.getPatrons().add(patron2);

        // Display information about the library, books, and patrons
        System.out.println("Library Name: " + library.getName());
        System.out.println("Books:");
        for (Book book : library.getBooks()) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
        System.out.println("Patrons:");
        for (Patron patron : library.getPatrons()) {
            System.out.println("- " + patron.getName() + " (ID: " + patron.getId() + ")");
        }

        // Example of borrowing a book
        System.out.println("Example of borrowing a book:");
        Borrowing borrowing = new Borrowing(patron1, book1);
        borrowing.setDueDate(new Date()); // Set due date to current date
        library.getBorrowings().add(borrowing);
        System.out.println("Book borrowed by " + borrowing.getPatron().getName() + ": " + borrowing.getBook().getTitle());
        System.out.println("Due Date: " + borrowing.getDueDate());
    }
}
