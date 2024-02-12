package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Expo Library");
        Librarian librarian = new Librarian(library);
        CatalogParser.parseAndLoadItems("library_catalog.txt", library); 
        
        // Create command factory
        CommandFactory factory = new CommandFactory();

        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

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

        // Close the scanner
        scanner.close();
    }     
}
