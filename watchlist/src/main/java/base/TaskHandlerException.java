package base;

public class TaskHandlerException extends Exception {

  private static final long serialVersionUID = 1L;

  public TaskHandlerException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public TaskHandlerException(final String message) {
    super(message);
  }
}
