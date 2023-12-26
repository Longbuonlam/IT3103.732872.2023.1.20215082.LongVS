package hust.soict.hedspi.aims.exception;

public class DuplicateMediaException  extends Exception {
    public DuplicateMediaException() {
        super("Duplicate media found.");
    }

    public DuplicateMediaException(String message) {
        super(message);
    }
}