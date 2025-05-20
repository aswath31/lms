package com.example.Model;

import java.util.*;

public class Patron {
    private final String id;
    private String name;
    private String email;
    private final List<LendingRecord> lendingHistory = new ArrayList<>();

    public Patron(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public List<LendingRecord> getLendingHistory() { return lendingHistory; }

    public void addLendingRecord(LendingRecord record) {
        lendingHistory.add(record);
    }
}
