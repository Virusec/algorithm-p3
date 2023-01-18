package example.exceptions;

public class ItemsFullException extends RuntimeException {
    public ItemsFullException() {
    }

    public ItemsFullException(String message) {
        super(message);
    }

    public ItemsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemsFullException(Throwable cause) {
        super(cause);
    }

    public ItemsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
