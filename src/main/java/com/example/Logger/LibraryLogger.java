package com.example.Logger;

public class LibraryLogger {
    public static void logInfo(String message) {
        System.out.println("INFO: " + message);
    }

    public static void logError(String message) {
        System.err.println("ERROR: " + message);
    }
}
