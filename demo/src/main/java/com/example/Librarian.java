package com.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Librarian {
    private Library library;
    private List<Borrowing> borrowings;

    public Librarian(Library library) {
        this.library = library;
        borrowings = new ArrayList<>();
    }
    
    public Library getLibrary() {
        return library;
    }

    public void checkout(Patron patron, LibraryItem item) {
        if (library.getCatalog().contains(item)) {
            // remove item from the catalog
            library.removeItem(item);

            // create a borrowing with a due date
            Date dueDate = generateDueDate(item);
            Borrowing borrowing = new Borrowing(patron, item);
            borrowing.setDueDate(dueDate);
            borrowings.add(borrowing);
        } else {
            System.out.println("Item not found in the catalog");
        }
    }

    public void checkin(Patron patron, LibraryItem item) {
        for (Borrowing borrowing : borrowings) {
            // if a borrowing exists by this patron with this item, return the book.
            if (borrowing.getPatron().equals(patron) && borrowing.getItem().equals(item)) {
                borrowings.remove(borrowing);
                break; // found the borrowing record
            }
        }

        // add item back to library catalog
        library.addItem(item);
    }

    private static Date generateDueDate(LibraryItem item) {
        Calendar calendar = Calendar.getInstance();

        if (item instanceof Book) {
            // Books due back in two weeks
            calendar.add(Calendar.WEEK_OF_YEAR, 2);
        } else if (item instanceof Dvd) {
            // Dvds due back in one week
            calendar.add(Calendar.WEEK_OF_YEAR, 1);
        } else {
            // Everything else due back in 2 days
            calendar.add(Calendar.DAY_OF_WEEK, 2);
        }
        return calendar.getTime();
    }
}