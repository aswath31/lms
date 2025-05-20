package com.example.Service;

import java.util.HashMap;
import java.util.Map;

import com.example.Model.Patron;

public class PatronService {
    private final Map<String, Patron> patronMap = new HashMap<>();

    public void addPatron(Patron patron) {
        patronMap.put(patron.getId(), patron);
    }

    public void updatePatron(Patron patron) {
        patronMap.put(patron.getId(), patron);
    }

    public Patron getPatronById(String id) {
        return patronMap.get(id);
    }
}
