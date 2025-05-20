package com.example.Factory;

import com.example.Model.Book;

public class BookFactory {
    public static Book createBook(String isbn, String title, String author, int year) {
        return new Book(isbn, title, author, year);
    }
}
