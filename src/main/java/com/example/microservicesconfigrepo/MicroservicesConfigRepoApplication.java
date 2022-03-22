package com.example.microservicesconfigrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroservicesConfigRepoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesConfigRepoApplication.class, args);
    }

}
