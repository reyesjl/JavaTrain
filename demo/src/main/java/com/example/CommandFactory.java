package com.example;

public class CommandFactory {
    private Librarian librarian;

    public CommandFactory(Librarian librarian) {
        this.librarian = librarian;
    }
    public Command createCommand(String commandName) {
        switch (commandName.toLowerCase()) {
            case "list":
                return new ListCommand();
            case "checkout":
                return new CheckoutCommand(librarian);
            case "checkin":
                return new CheckinCommand();
            case "search":
                return new SearchCommand();
            case "exit":
                return new ExitCommand();
            default:
                System.out.println("Unknown command.");
                return null;
        }
    }
}
