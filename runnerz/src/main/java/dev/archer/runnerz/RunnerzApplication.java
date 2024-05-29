package dev.archer.runnerz;

import dev.archer.runnerz.run.Location;
import dev.archer.runnerz.run.Run;
import dev.archer.runnerz.run.RunRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.logging.Logger;

@SpringBootApplication
public class RunnerzApplication {
    private static final Logger logger = Logger.getLogger(RunnerzApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(RunnerzApplication.class, args);

    }

//    @Bean
//    CommandLineRunner runner(RunRepository runRepository) {
//        return args -> {
//            Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
//            logger.info("Run: " + run);
//            runRepository.create(run);
//        };
//    }
}
