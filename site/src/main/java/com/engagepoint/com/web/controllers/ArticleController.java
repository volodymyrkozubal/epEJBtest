package com.engagepoint.com.web.controllers;

import com.engagepoint.labs.core.model.Article;
import com.engagepoint.labs.core.model.ArticleEJB;
import com.engagepoint.labs.core.service.ArticleService;
import com.engagepoint.labs.core.service.ArticleServiceImpl;
import lombok.Data;
import org.primefaces.context.RequestContext;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author volodymyr.kozubal
 */
@ManagedBean(name = "table")
@RequestScoped
@Data
public class ArticleController implements Serializable {
    @ManagedProperty(value = "#{articleBean}")
    private ArticleBean articleBean;

    @EJB
    private ArticleEJB articleEJB;
    private Article article;

    private List<Article> articleList = new ArrayList<Article>();
    private ArticleService articleService;
    private int sentencesNumber;

    public ArticleController() {
//        articleList = articleEJB.findArticles();
        articleService = ArticleServiceImpl.getService();
        sentencesNumber = 3;
    }

    public void addnewArticle() {
        article = new Article(articleBean.getContent(), articleBean.getAuthor(), articleBean.getHeader());
        articleEJB.createArticle(article);
        articleList = articleEJB.findArticles();
    }

    public String receiveTopXSentences(Article article) {
        return articleService.receiveTopXSentences(article, sentencesNumber);
    }

    public void selectArticle(Article article) {
        articleBean.setSelected(article);
        RequestContext.getCurrentInstance().execute("aticleDialog.show()");
    }

}
