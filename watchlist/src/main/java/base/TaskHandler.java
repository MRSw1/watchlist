package base;

import java.util.Map;

/** Task Handler to handle messages for a process topic of the connected BPM engine. */
public interface TaskHandler {

  /**
   * The process topic this handler should register to
   *
   * @return
   */
  String getTopic();

  /**
   * This method gets called once a message is available for the process topic of the connected BPM
   * engine.
   *
   * @param processId
   * @param businessKey
   * @param processVariables Incoming process variables
   * @return Outgoing process variables as a result of this method, can be an empty map but not null
   * @throws TaskHandlerException
   */
  Map<String, Object> handle(
      final String processId, final String businessKey, final Map<String, Object> processVariables)
      throws TaskHandlerException, BpmBusinessException;
}
