package com.example.restapi.controller;
import com.example.restapi.data.DTO.ArticleDTO;
import com.example.restapi.service.ArticleService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.OPTIONS})
public class ArticleController {
    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }


    @GetMapping("/articles")
    public ResponseEntity<String> searchUser() {
        List<ArticleDTO> articles = articleService.fetchArticles();
        //articles to json
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonResponse = "";
        try {
            jsonResponse = objectMapper.writeValueAsString(articles);
        } catch (JsonProcessingException e) {
            // Handle exception if JSON processing fails
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while processing JSON.");
        }
        // Return a success response
        return ResponseEntity.ok(jsonResponse);
    }
}
