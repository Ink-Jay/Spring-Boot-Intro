package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public static List<Student> getStudents(){
        return List.of(
                new Student(
                        "Mariam",
                        "mariamSawanda@gmail.com",
                        LocalDate.of(1997, Month.OCTOBER, 10),
                        21
                )
        );
    }
}
