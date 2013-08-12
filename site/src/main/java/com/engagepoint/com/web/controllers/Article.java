package com.engagepoint.com.web.controllers;


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
//    @ElementCollection
//    private List<Comment> commentList;

<<<<<<< HEAD:core/src/main/java/com/engagepoint/labs/core/model/Article.java
    public Article() {
        commentList = new ArrayList<Comment>();
    }

    public Article(String content, String author, String header) {
        this.author = author;
        this.content = content;
        this.header = header;
        this.creationDate = new Date();
    }
=======
//    public Article() {
        //commentList = new ArrayList<Comment>();
//    }
>>>>>>> 6b813e8640aab0961d71afad92be8d96be049027:site/src/main/java/com/engagepoint/com/web/controllers/Article.java
}
