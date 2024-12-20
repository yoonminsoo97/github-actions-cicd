package com.example.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<String> sayHelloWorld() {
        return ResponseEntity.ok().body("Hello World!! GitHub Actions CI/CD Project!!!");
    }

}
