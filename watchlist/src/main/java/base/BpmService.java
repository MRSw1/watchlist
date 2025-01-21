package base;

import java.util.Map;
import org.springframework.lang.Nullable;

public interface BpmService extends TaskService {

  /**
   * Sends a message.
   *
   * @param name The message name defined in the process definition this message is sent to
   * @param processId The process id for which the message is sent
   * @param processVariables Process variables to send, can be an empty map
   */
  void sendMessage(
      final String name, final String processId, final Map<String, Object> processVariables)
      throws BpmException;

  /**
   * Starts a process instance using the latest version of the process definition
   *
   * @param name Process definition (latest version) to start a process instance for
   * @return The process instance id
   */
  String startProcess(final String name) throws BpmException;

  /**
   * Starts a process instance using the latest version of the process definition
   *
   * @param name Process definition (latest version) to start a process instance for
   * @param businessKey Id to link the process instance to an external key (e.g. correlationId)
   * @param processVariables Process variables to set, can be an empty map
   * @return The process instance id
   */
  String startProcess(
      final String name, final String businessKey, final Map<String, Object> processVariables)
      throws BpmException;

  /**
   * @param name Process definition to find the process instance id for
   * @param businessKey Id to find the process instance id for
   * @return
   * @throws BpmException
   */
  @Nullable
  String findProcessId(final String name, final String businessKey) throws BpmException;
}
