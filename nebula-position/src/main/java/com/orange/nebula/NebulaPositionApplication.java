package com.orange.nebula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class NebulaPositionApplication {

    public static void main(String[] args) {
        SpringApplication.run(NebulaPositionApplication.class, args);
    }

}
