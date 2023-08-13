package com.example.restapi.service;


import com.example.restapi.data.DAO.ArticleRepository;
import com.example.restapi.data.DAO.ArticlesRepository;
import com.example.restapi.data.DTO.ArticleDTO;
import com.example.restapi.data.DTO.ArticlesDTO;
import com.example.restapi.data.Entity.ArticleEntity;
import com.example.restapi.data.Entity.ArticlesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private static ArticlesRepository articlesRepository;
    private static ArticleRepository articleRepository;
    private static ArticlesMapper articlesMapper;
    private static ArticleMapper articleMapper;

    @Autowired
    public void ArticleService(ArticlesRepository articlesRepository, ArticleRepository articleRepository, ArticlesMapper articlesMapper, ArticleMapper articleMapper){
        this.articlesRepository = articlesRepository;
        this.articleRepository = articleRepository;
        this.articlesMapper = articlesMapper;
        this.articleMapper = articleMapper;
    }


    public static String getLatestArticles() {
//        get data using articlesRepositor
        List<ArticlesEntity> Aricles = articlesRepository.getLatestArticles();
        List<ArticlesDTO> articleDTOs = articlesMapper.mapEntityListToDTOList(Aricles);
        String json = articlesMapper.convertDTOsToJson(articleDTOs);
        return json;
    }

    public static String getArticle(Long id) {
        ArticleEntity article = articleRepository.getArticle(id);
        ArticleDTO articleDTO = articleMapper.mapEntityToDTO(article);
        String json = articleDTO.toJson();
        return json;
    }
}

