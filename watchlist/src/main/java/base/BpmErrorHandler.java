package base;

/** Defines the name of the error handler used in the process definition */
public interface BpmErrorHandler {

  /**
   * Name of the error handler
   *
   * @return
   */
  public String getBusinessErrorName();
}
