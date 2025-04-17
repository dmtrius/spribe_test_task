package pl.spribe.spribe;

import org.springframework.boot.SpringApplication;

public class TestSpribeApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpribeApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
