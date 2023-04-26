package People;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileWriterExample {
    public static void main(String args[]) {
        String filename = "myFile.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filename);
            fileWriter.write("Hello, All!");
            System.out.println("Successfully wrote to file.");

            log("Successfully wrote to file.", filename);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();

            log("An error occurred while writing to the file.", e, filename);

        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file.");
                e.printStackTrace();

                log("An error occurred while closing the file.", e, filename);

            }
        }
    }
    public static void log(String message, String filename) {
        // Log message to console
        System.out.println(message);

        // Log message to file
        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            fileWriter.write("[" + dtf.format(now) + "] " + message + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
    public static void log(String message, Exception e, String filename) {
        // Log message and exception to console
        System.out.println(message);
        e.printStackTrace();

        // Log message and exception to file
        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            fileWriter.write("[" + dtf.format(now) + "] " + message + "\n");
            e.printStackTrace();
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("An error occurred while writing to the file.");
            ex.printStackTrace();
        }
    }
}

