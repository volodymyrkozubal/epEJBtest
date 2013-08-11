package com.engagepoint.com.web.controllers;


import com.engagepoint.labs.core.model.Article;
import lombok.Data;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;
import java.io.Serializable;

/**
 * @author volodymyr.kozubal
 */
@ManagedBean(name = "articleBean")
@RequestScoped
public @Data class ArticleBean implements Serializable {
    private  String content;
    private  String author;
    private  String header;
    private  int commentsamount;
    private Article selected;
//    private  ArticleService articleService;

    @ManagedProperty(value = "#{commentBean}")
    private CommentBean commentBean;

    public ArticleBean(){
//        articleService = ArticleServiceImpl.getService();
    }
}
