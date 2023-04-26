package People;

public class InvalidSalaryException extends Exception {
    public InvalidSalaryException() {
        super("Invalid salary entered for cashier.");
    }
}
