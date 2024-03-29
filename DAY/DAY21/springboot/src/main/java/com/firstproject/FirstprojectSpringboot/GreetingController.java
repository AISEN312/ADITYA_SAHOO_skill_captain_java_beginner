package com.firstproject.FirstprojectSpringboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
class GreetingController {

    @GetMapping("/greet/{name}")
    public String greetPerson(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
} 
