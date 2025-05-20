package com.example.Observer;

public class LibraryEvent {
    private final String message;

    public LibraryEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

