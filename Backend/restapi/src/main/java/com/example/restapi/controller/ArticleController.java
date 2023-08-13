package com.example.restapi.controller;
import com.example.restapi.service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.OPTIONS})
public class ArticleController {
    @GetMapping("/main")
    public ResponseEntity<String> getLatestArticles() {
        String articles = ArticleService.getLatestArticles();
        return ResponseEntity.ok(articles);
    }

    @GetMapping("/article/{id}")
    public ResponseEntity<String> getArticle(@PathVariable("id") Long id) {

        String article = ArticleService.getArticle(id);
        return ResponseEntity.ok(article);
    }
}
