package com.example.restapi.data.DAO;

import com.example.restapi.data.Entity.ArticlesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlesRepository extends JpaRepository<ArticlesEntity, Long> {
    @Query(value = "SELECT a.article_id, a.title_id,a.author_id, au.name, t.title, t.subtitle, t.date, t.readtime, t.tag\n" +
            "FROM article a\n" +
            "JOIN author au ON a.author_id = au.author_id\n" +
            "JOIN title t ON a.title_id = t.title_id\n" +
            "ORDER BY t.date DESC\n" +
            "LIMIT 3;", nativeQuery = true)
    List<ArticlesEntity> getLatestArticles();

}