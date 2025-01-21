package base;

public class BpmBusinessException extends Exception {

  private static final long serialVersionUID = 1L;

  public BpmBusinessException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public BpmBusinessException(final String message) {
    super(message);
  }
}
