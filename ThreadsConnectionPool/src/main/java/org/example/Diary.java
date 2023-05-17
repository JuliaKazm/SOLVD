package org.example;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private List<String> entries = new ArrayList<>();
    public synchronized void writeEntry(String entry) {
        entries.add(entry);
    }
    public void printEntries() {
        for (String entry : entries) {
            System.out.println(entry);
        }
    }
    public static void main(String[] args) {
        Diary diary = new Diary();
        diary.writeEntry("Milk");
        diary.writeEntry("Cheese");
        diary.writeEntry("Yogurt");
        diary.printEntries();
    }
}
