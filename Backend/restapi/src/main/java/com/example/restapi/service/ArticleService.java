package com.example.restapi.service;

import com.example.restapi.data.DAO.ArticleRepository;
import com.example.restapi.data.DTO.ArticleDTO;
import com.example.restapi.data.Entity.ArticleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<ArticleDTO> fetchArticles() {
        List<ArticleEntity> articles = articleRepository.findAll();

        List<ArticleDTO> articleDTOs = articles.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());

        return articleDTOs;
    }

    private ArticleDTO convertToDTO(ArticleEntity article) {
        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setArticleTitle(article.getArticleTitle());
        articleDTO.setArticleUri(article.getArticleUri());
        articleDTO.setArticleSummary(article.getArticleSummary());
        articleDTO.setDateAdded(article.getDateAdded());

        return articleDTO;
    }
}

