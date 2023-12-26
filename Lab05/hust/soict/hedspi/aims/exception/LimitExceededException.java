package hust.soict.hedspi.aims.exception;

public class LimitExceededException extends Exception {
    public LimitExceededException() {
        super("Limit exceeded.");
    }

    public LimitExceededException(String message) {
        super(message);
    }
}