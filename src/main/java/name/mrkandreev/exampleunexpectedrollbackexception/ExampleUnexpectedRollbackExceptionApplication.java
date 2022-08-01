package name.mrkandreev.exampleunexpectedrollbackexception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExampleUnexpectedRollbackExceptionApplication {

  public static void main(String[] args) {
    SpringApplication.run(ExampleUnexpectedRollbackExceptionApplication.class, args);
  }

}
