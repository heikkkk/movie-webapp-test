package dev.heik.tests.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Initializes the backend of the Movies Application using springboot.
 */
@SpringBootApplication
public class MoviesApplication {

  public static void main(String[] args) {
    SpringApplication.run(MoviesApplication.class, args);
  }

}
