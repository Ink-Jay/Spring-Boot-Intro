package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.OCTOBER;
import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student mariam =  new Student(
                    "Mariam",
                    "mariamSawanda@gmail.com",
                    LocalDate.of(1998, OCTOBER,10)
            );
            Student mark =  new Student(
                    "Mark",
                    "marko@gmail.com",
                    LocalDate.of(1999, SEPTEMBER,14)
            );

            repository.saveAll(
                    List.of(mariam, mark)
            );
        };
    }


}
