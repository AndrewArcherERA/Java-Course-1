package dev.archer.runnerz.run;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import java.util.logging.Logger;

public class RunJsonDataLoader implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(RunJsonDataLoader.class);
    private final RunRepository runRepository;

    public RunJsonDataLoader(final RunRepository runRepository) {
        this.runRepository = runRepository;
    }
}
