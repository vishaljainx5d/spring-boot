package com.springboot.amigoscode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public GreetResponse greet() {
        GreetResponse greetResponse = new GreetResponse("Hello",
                List.of("Java", "GoLang", "Javascript"),
                new Person("Vishal", 32, 30_000));
        return greetResponse;
    }

    private record Person(String name, int age, double availableSavings) {
    }

    private record GreetResponse(String greet,
                         List<String> favProgramingLanguages,
                         Person person) {
    }
}
