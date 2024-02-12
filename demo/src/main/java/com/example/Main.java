package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Expo Library");
        Librarian librarian = new Librarian(library);
        CatalogParser.parseAndLoadItems("library_catalog.txt", library); 
    }     
}
