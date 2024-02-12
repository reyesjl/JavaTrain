package com.example;
import java.util.Date;

public class Borrowing {
    private Patron patron;
    private LibraryItem item;
    private Date dueDate;

    public Borrowing(Patron patron, LibraryItem item) {
        this.patron = patron;
        this.item = item;
    }

    public Patron getPatron() {
        return patron;
    }

    public LibraryItem getItem() {
        return item;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    public void setItem(LibraryItem item) {
        this.item = item;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}