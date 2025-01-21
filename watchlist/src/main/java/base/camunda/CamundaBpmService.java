package base.camunda;

import base.BpmBusinessException;
import base.BpmErrorHandler;
import base.BpmException;
import base.BpmService;
import base.TaskHandler;
import base.TaskHandlerException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.client.ExternalTaskClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/** Camunda 7 specific implementation of a task service */
@Slf4j
@Component
public class CamundaBpmService implements BpmService {
  private final ExternalTaskClient client;


  public CamundaBpmService(@Value("${bpm.baseUrl}") final String baseUrl) {
    this.client = ExternalTaskClient.create().lockDuration(10000).baseUrl(baseUrl).build();
  }

  @Override
  public void register(final TaskHandler handler) {
    final String topic = handler.getTopic();
    this.client
        .subscribe(topic)
        .handler(
            (externalTask, externalTaskService) -> {
              final String processId = externalTask.getProcessInstanceId();
   
              try {
                externalTaskService.complete(
                    externalTask,
                    handler.handle(
                        processId, externalTask.getBusinessKey(), externalTask.getAllVariables()));
              } catch (RuntimeException | TaskHandlerException e) {
                final Integer retries = externalTask.getRetries();
                externalTaskService.handleFailure(
                    externalTask,
                    externalTask.getBusinessKey(),
                    e.getMessage(),
                    retries == null ? 3 : retries - 1,
                    5000);
                return;
              } catch (final BpmBusinessException e) {
                if (handler instanceof BpmErrorHandler) {
                  externalTaskService.handleBpmnError(
                      externalTask,
                      ((BpmErrorHandler) handler).getBusinessErrorName(),
                      e.getMessage());
                }
                return;
              }
            })
        .open();
  }

@Override
public void sendMessage(String name, String processId, Map<String, Object> processVariables) throws BpmException {
	// TODO Auto-generated method stub
	
}

@Override
public String startProcess(String name) throws BpmException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String startProcess(String name, String businessKey, Map<String, Object> processVariables) throws BpmException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String findProcessId(String name, String businessKey) throws BpmException {
	// TODO Auto-generated method stub
	return null;
}
}
