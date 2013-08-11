package com.engagepoint.labs.core.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author volodymyr.kozubal
 */
@Entity
@NamedQuery(name = "findAllArticles", query = "SELECT a FROM Article a")
public
@Data
class Article {
    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    private String content;
    private int commentsamount;
    private String author;
    private String header;
    @ElementCollection
    private List<Comment> commentList;

    public Article() {
        commentList = new ArrayList<Comment>();
    }

    public Article(String content, String author, String header) {
        this.author = author;
        this.content = content;
        this.header = header;
        this.creationDate = new Date();
    }
}
