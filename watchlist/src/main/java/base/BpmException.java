package base;

public class BpmException extends Exception {

  private static final long serialVersionUID = 1L;

  public BpmException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public BpmException(final String message) {
    super(message);
  }
}
