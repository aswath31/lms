package com.example;

import com.example.Factory.BookFactory;
import com.example.Model.Book;
import com.example.Model.Patron;
import com.example.Service.BookService;
import com.example.Service.LendingService;
import com.example.Service.PatronService;

public class LibraryApplication {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        PatronService patronService = new PatronService();
        LendingService lendingService = new LendingService(bookService, patronService);

        Book book1 = BookFactory.createBook("1234", "Effective Java", "Joshua Bloch", 2018);
        bookService.addBook(book1);

        Patron patron1 = new Patron("p1", "Alice", "alice@example.com");
        patronService.addPatron(patron1);

        lendingService.checkoutBook("1234", "p1");
        lendingService.returnBook("1234", "p1");
    }
}