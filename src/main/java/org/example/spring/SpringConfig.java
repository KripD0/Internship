package org.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ComponentScan("org.example.spring")
@Configuration
@ImportResource("classpath:springConfig.xml")
public class SpringConfig {

    @Bean
    public FantasticBook fantasticBook() {
        return new FantasticBook();
    }

}
