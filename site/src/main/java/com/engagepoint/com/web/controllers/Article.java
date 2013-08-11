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
public  @Data class Article {
    @Id
    @GeneratedValue
    private Long id;
    private Date creationDate;
    private String content;
    private int commentsamount;
    private String author;
    private String header;
//    @ElementCollection
//    private List<Comment> commentList;

//    public Article() {
        //commentList = new ArrayList<Comment>();
//    }
}
