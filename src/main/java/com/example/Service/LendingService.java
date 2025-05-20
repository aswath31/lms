package com.example.Service;

import com.example.Logger.LibraryLogger;
import com.example.Model.Book;
import com.example.Model.LendingRecord;
import com.example.Model.Patron;

public class LendingService {
    private final BookService bookService;
    private final PatronService patronService;

    public LendingService(BookService bookService, PatronService patronService) {
        this.bookService = bookService;
        this.patronService = patronService;
    }

    public boolean checkoutBook(String isbn, String patronId) {
        Book book = bookService.getBookByISBN(isbn);
        Patron patron = patronService.getPatronById(patronId);

        if (book != null && patron != null && book.isAvailable()) {
            book.setAvailable(false);
            LendingRecord record = new LendingRecord(book);
            patron.addLendingRecord(record);
            LibraryLogger.logInfo("Book checked out: " + isbn);
            return true;
        }
        LibraryLogger.logError("Checkout failed for book: " + isbn);
        return false;
    }

    public boolean returnBook(String isbn, String patronId) {
        Book book = bookService.getBookByISBN(isbn);
        Patron patron = patronService.getPatronById(patronId);

        if (book != null && patron != null) {
            book.setAvailable(true);
            for (LendingRecord record : patron.getLendingHistory()) {
                if (record.getBook().equals(book) && record.getReturnDate() == null) {
                    record.returnBook();
                    LibraryLogger.logInfo("Book returned: " + isbn);
                    return true;
                }
            }
        }
        LibraryLogger.logError("Return failed for book: " + isbn);
        return false;
    }

}