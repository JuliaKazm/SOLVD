package People;

public class InvalidAllowanceException extends Exception {
    public InvalidAllowanceException() {
        super("Invalid allowance entered for manager.");
    }
}
