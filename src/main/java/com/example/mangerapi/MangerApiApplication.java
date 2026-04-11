package com.example.mangerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Manger API application.
 */
@SpringBootApplication
public  class MangerApiApplication {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private MangerApiApplication() {
    }

    /**
     * Starts the Spring Boot application.
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(MangerApiApplication.class, args);
        System.out.println("login successful development v2.0");
    }
}
