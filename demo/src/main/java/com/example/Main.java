package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create the library instance
        Library library = Library.getInstance("Expo Library");
        CatalogParser.parseAndLoadItems("library_catalog.txt", library); 
        
        // create a librarian 
        Librarian librarian = new Librarian(library);

        // Create command factory
        CommandFactory factory = new CommandFactory(librarian);

        // Create a patron named Bob
        Patron bob = new Patron("123456", "Bob", 50.0);
        library.addPatron(bob);

        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Main loop
            while (true) {
                // Prompt user for input
                System.out.println("Enter a command (list/checkout/checkin/search/exit):");
                String userInput = scanner.nextLine();

                // Create command based on user input
                Command command = factory.createCommand(userInput);

                // Execute the command
                if (command != null) {
                    command.execute();
                }

                // Exit loop if user inputs "exit"
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        } finally {
            // Close the scanner
            scanner.close();
        }
    }     
}
