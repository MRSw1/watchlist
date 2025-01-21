package ExternalTaskHandlers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"base", "ExternalTaskHandlers"})
public class App {

  @SuppressWarnings("resource")
  public static void main(final String... args) {
    SpringApplication.run(App.class, args);
  }
}
