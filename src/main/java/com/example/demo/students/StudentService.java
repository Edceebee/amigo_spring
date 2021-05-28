package com.example.demo.students;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;



@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student("Nonso",
                        "nonso@gmail.com",
                        26,
                        LocalDate.of(1995, Month.JANUARY, 21)),
                new Student("Tony",
                        "tony@gmail.com",
                        23,
                        LocalDate.of(1998, Month.JANUARY, 27

                        ))
        );
    }
}
