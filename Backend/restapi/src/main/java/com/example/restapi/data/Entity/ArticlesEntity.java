package com.example.restapi.data.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ArticlesEntity {
//    a.article_id, a.title_id,a.author_id, t.name, t.title, t.subtitle, t.date, t.readtime t.tag
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long article_id;
    private Long title_id;
    private Long author_id;

    private String name;
    private String title;
    private String subtitle;
    private String date;
    private int readtime;
    private String tag;

    public ArticlesEntity() {
    }

    public ArticlesEntity(Long article_id, Long title_id, Long author_id, String name, String title, String subtitle, String date, int readtime, String tag) {
        this.article_id = article_id;
        this.title_id = title_id;
        this.author_id = author_id;
        this.name = name;
        this.title = title;
        this.subtitle = subtitle;
        this.date = date;
        this.readtime = readtime;
        this.tag = tag;
    }

    public Long getArticle_id() {
        return this.article_id;
    }

    public void setArticle_id(Long article_id) {
        this.article_id = article_id;
    }

    public Long getTitle_id() {
        return this.title_id;
    }

    public void setTitle_id(Long title_id) {
        this.title_id = title_id;
    }

    public Long getAuthor_id() {
        return this.author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getReadtime() {
        return this.readtime;
    }

    public void setReadtime(int readtime) {
        this.readtime = readtime;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
