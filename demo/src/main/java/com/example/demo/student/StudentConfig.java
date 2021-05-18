package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student guillermo = new Student(
                    "Guillermo",
                    "guillermopeitzner@gmail.com",
                    LocalDate.of(1996, 12, 1));
            Student gaby = new Student(
                    "gaby",
                    "gaby@gmail.com",
                    LocalDate.of(1996, 12, 1));
            studentRepository.saveAll(List.of(guillermo, gaby));
        };
    }
}
