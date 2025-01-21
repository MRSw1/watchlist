package base;

/**
 * Task handlers must be registered to this task service in order to receive messages from the BPM
 * engine connected to.
 */
public interface TaskService {

  /**
   * Register a task handler to a process topic defined by the handler
   *
   * @param handler
   */
  void register(final TaskHandler handler);
}
