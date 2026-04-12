package com.example.mangerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Manger API application.
 */
@SuppressWarnings("checkstyle:FinalClass")
@SpringBootApplication
public  class MangerApiApplication {
    public MangerApiApplication() {
    }
    /**
     * Starts the Spring Boot application.
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(MangerApiApplication.class, args);
        System.out.println("login successful release 4v.0");
    }
}
