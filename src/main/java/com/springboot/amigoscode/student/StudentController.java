package com.springboot.amigoscode.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return List.of(
                new Student(1L,
                        "Vishal",
                        "vishaljainx5d@gmail.com",
                        32,
                        LocalDate.of(1993, 11, 14))
        );
    }
}
