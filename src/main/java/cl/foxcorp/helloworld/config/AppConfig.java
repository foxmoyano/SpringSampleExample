package cl.foxcorp.helloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String getSampleService() {
        return "Ok";
    }
}
