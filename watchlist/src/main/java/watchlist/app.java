package watchlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // Enables Spring Boot auto-configuration and component scanning
public class app {

    public static void main(String[] args) {
        // Launch the Spring Boot application
        SpringApplication.run(app.class, args);
    }
}