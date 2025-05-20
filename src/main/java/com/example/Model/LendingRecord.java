package com.example.Model;

import java.time.LocalDate;


public class LendingRecord {
    private final Book book;
    private final LocalDate borrowDate;
    private LocalDate returnDate;

    public LendingRecord(Book book) {
        this.book = book;
        this.borrowDate = LocalDate.now();
    }

    public Book getBook() { return book; }
    public LocalDate getBorrowDate() { return borrowDate; }
    public LocalDate getReturnDate() { return returnDate; }

    public void returnBook() {
        this.returnDate = LocalDate.now();
    }
}
