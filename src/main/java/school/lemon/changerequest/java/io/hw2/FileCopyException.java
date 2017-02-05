package school.lemon.changerequest.java.io.hw2;

public class FileCopyException extends Exception {
    public FileCopyException() {
    }

    public FileCopyException(String message) {
        super(message);
    }

    public FileCopyException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileCopyException(Throwable cause) {
        super(cause);
    }

    public FileCopyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
