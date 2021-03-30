package com.example.dictionaryapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")

public class ArticlesController {

    @GetMapping
    public ResponseEntity getArticles() {
        try {
            return ResponseEntity.ok("Server is working");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Something was wrong");
        }
    }
}
