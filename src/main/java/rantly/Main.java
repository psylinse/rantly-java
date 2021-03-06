package rantly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(Main.class);
        app.setShowBanner(false);
        app.run(args);
    }
}
