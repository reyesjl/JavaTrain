package com.example;
import java.util.Date;

public class Borrowing {
    private Patron patron;
    private Book book;
    private Date dueDate;

    public Borrowing(Patron patron, Book book) {
        this.patron = patron;
        this.book = book;
    }

    public Patron getPatron() {
        return patron;
    }

    public Book getBook() {
        return book;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}