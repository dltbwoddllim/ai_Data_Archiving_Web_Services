package com.example.restapi.data.DTO;

import java.util.Date;

public class ArticleDTO {
    private Long id;
    private String articleTitle;
    private String articleUri;
    private String articleSummary;
    private Date dateAdded;

    // Constructors, getters, and setters
    public ArticleDTO() {

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

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public void setArticleUri(String articleUri) {
        this.articleUri = articleUri;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

}
