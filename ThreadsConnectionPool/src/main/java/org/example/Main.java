package org.example;

public class Main {
    public static void main(String[] args) {

        Diary diary = new Diary();
        // Creating a thread using the Runnable interface
        Runnable task1 = () -> {
            diary.writeEntry("Thread 1: Started working on Task A.");
            diary.writeEntry("Thread 1: Completed Task A.");
        };

        Thread thread1 = new Thread(task1);
        // Creating a thread using the Thread class
        Thread thread2 = new Thread(() -> {
            diary.writeEntry("Thread 2: Started working on Task B.");
            diary.writeEntry("Thread 2: Completed Task B.");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        diary.printEntries();
    }
}

