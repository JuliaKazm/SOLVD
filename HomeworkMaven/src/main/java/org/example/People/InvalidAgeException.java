package org.example.People;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Invalid age entered for person.");
    }
}
