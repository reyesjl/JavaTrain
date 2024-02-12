package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CatalogParser {
    public static void parseAndLoadItems(String fileName, Library library) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean parsingBooks = false;
            boolean parsingDvds = false;

            while ((line = br.readLine()) != null) {
                if (line.equals("# BOOKS")) {
                    parsingBooks = true;
                    parsingDvds = false;
                } else if (line.equals("# DVDS")) {
                    parsingBooks = false;
                    parsingDvds = true;
                } else if (line.startsWith("*")) {
                    // Parse books or DVDs based on the parsing mode
                    if (parsingBooks) {
                        Book book = parseBook(line.substring(2));
                        library.addItem(book);
                    } else if (parsingDvds) {
                        Dvd dvd = parseDvd(line.substring(2));
                        library.addItem(dvd);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Book parseBook(String line) {
        String[] parts = line.split(", ");
        String title = parts[0];
        String author = parts[1];
        String isbn = parts[2];
        int publicationYear = Integer.parseInt(parts[3]);
        String genre = parts[4];
        return new Book(title, author, isbn, publicationYear, true, genre);
    }

    private static Dvd parseDvd(String line) {
        String[] parts = line.split(", ");
        String title = parts[0];
        String director = parts[1];
        String isbn = parts[2];
        int releaseYear = Integer.parseInt(parts[3]);
        return new Dvd(title, director, isbn, releaseYear, true, "DVD");
    }
}
