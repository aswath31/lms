package com.example.Observer;

public class EmailNotifier implements LibraryObserver {
    @Override
    public void update(LibraryEvent event) {
        System.out.println("Email Notification: " + event.getMessage());
    }
}
