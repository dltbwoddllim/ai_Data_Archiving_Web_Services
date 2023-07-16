package com.example.restapi.data.Entity;



import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "articles")
public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String articleTitle;
    @Column(unique = true)
    private String articleUri;
    private String articleSummary;
    private Date dateAdded;


    // Constructors, getters, and setters
    public ArticleEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleUri() {
        return articleUri;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setId(Long id) {
        this.id = id;
    }


}

