package com.example.Observer;

import java.util.*;

public class NotificationService {
    private final List<LibraryObserver> observers = new ArrayList<>();

    public void registerObserver(LibraryObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(LibraryEvent event) {
        for (LibraryObserver observer : observers) {
            observer.update(event);
        }
    }
}




