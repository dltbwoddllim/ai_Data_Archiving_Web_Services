package com.example.restapi.service;

import com.example.restapi.data.DTO.ArticleDTO;
import com.example.restapi.data.Entity.ArticleEntity;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {

        public ArticleDTO mapEntityToDTO(ArticleEntity entity) {
        ArticleDTO dto = new ArticleDTO(
                entity.getArticle_id(),
                entity.getTitle_id(),
                entity.getAuthor_id(),
                entity.getName(),
                entity.getTitle(),
                entity.getSubtitle(),
                entity.getDate(),
                entity.getReadtime(),
                entity.getTag(),
                entity.getText()
        );
        System.out.println(dto.toString());
        return dto;
    }


    public String convertDTOsToJson(ArticleDTO dto) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("["); // Start of JSON array

        jsonBuilder.append(dto.toJson());

        jsonBuilder.append("]"); // End of JSON array

        return jsonBuilder.toString();
    }

}