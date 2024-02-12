package com.example;

public class CommandFactory {
    public Command createCommand(String commandName) {
        switch (commandName.toLowerCase()) {
            case "list":
                return new ListCommand();
            case "checkout":
                return new CheckoutCommand();
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
