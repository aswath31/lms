package com.example.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.Model.Book;

public class BookService {
    private final Map<String, Book> bookInventory = new HashMap<>();

    public void addBook(Book book) {
        bookInventory.put(book.getId(), book);
    }

    public void removeBook(String isbn) {
        bookInventory.remove(isbn);
    }

    public Book getBookByISBN(String isbn) {
        return bookInventory.get(isbn);
    }

    public List<Book> searchBooks(String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookInventory.values()) {
            if (book.getTitle().contains(keyword) ||
                book.getAuthor().contains(keyword) ||
                book.getId().contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    public Collection<Book> getAllBooks() {
        return bookInventory.values();
    }
}
