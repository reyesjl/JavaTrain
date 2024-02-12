package com.example;

import java.util.Scanner;

public class CheckoutCommand implements Command {
    private Librarian librarian;

    public CheckoutCommand(Librarian librarian) {
        this.librarian = librarian;
    }

    public void execute() {
        // Prompt user for item details
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the item you want to check out:");
        String title = scanner.nextLine();
        System.out.println("Enter your name:");
        String patronName = scanner.nextLine();

        // Retrieve the patron from the library
        Patron patron = librarian.getLibrary().findPatronByName(patronName);
        if (patron == null) {
            System.out.println("Patron not found. Please register as a patron first.");
            return;
        }

        // Retrieve the item from the library's catalog
        LibraryItem item = librarian.getLibrary().findItemByTitle(title);
        if (item == null) {
            System.out.println("Item not found in the library's catalog.");
            return;
        }

        // Perform the checkout operation
        librarian.checkout(patron, item);
        System.out.println("Checkout successful!");
    }
}
