package com.example.Model;

public class Book extends LibraryItem {
    private String author;
    private int publicationYear;
    private boolean isAvailable = true;

    public Book(String isbn, String title, String author, int year) {
        super(isbn, title);
        this.author = author;
        this.publicationYear = year;
    }

    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String getDescription() {
        return getTitle() + " by " + author + " (" + publicationYear + ")";
    }
}
