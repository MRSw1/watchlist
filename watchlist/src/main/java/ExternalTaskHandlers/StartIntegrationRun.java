package ExternalTaskHandlers;

import base.AbstractTaskHandler;
import base.BpmBusinessException;
import base.BpmErrorHandler;
import base.TaskHandlerException;
import base.TaskService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StartIntegrationRun extends AbstractTaskHandler implements BpmErrorHandler {

  private final ObjectMapper om;

  public StartIntegrationRun(final TaskService taskService, final ObjectMapper om) {
    super(taskService);
    this.om = om;
  }

  @Override
  public String getTopic() {
    return "start-integration-run";
  }

  @Override
  public Map<String, Object> handle(
      final String processId, final String businessKey, final Map<String, Object> processVariables)
      throws TaskHandlerException, BpmBusinessException {
    Map<String, Object> map = new HashMap<>();
      
      return map; 
  }

  @Override
  public String getBusinessErrorName() {
    return "Err-no-integration-run";
  }
}
