package org.example.People;

public class InvalidHoursException extends Exception {
    public InvalidHoursException() {
        super("Invalid hours entered for worker.");
    }
}
