package com.engagepoint.com.web.controllers;

import com.engagepoint.labs.core.model.Article;
import com.engagepoint.labs.core.service.CMISService;
import com.engagepoint.labs.core.service.CMISServiceImpl;
import org.primefaces.context.RequestContext;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author volodymyr.kozubal
 */
@ManagedBean(name = "table")
@SessionScoped
public class TableBean implements Serializable {
    @ManagedProperty(value = "#{articleBean}")
    private ArticleBean articleBean;

    private List<Article> articleList;
    private CMISService cmisService;
    private int sentencesNumber;

     public TableBean(){

         cmisService = CMISServiceImpl.getService();
         articleList = new ArrayList<Article>();
         sentencesNumber=3;
     }
    public void  addnewArticle(){
        Article article = cmisService.createArticle( articleBean.getContent(), articleBean.getAuthor(), articleBean.getHeader());
        articleList.add(article);
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public ArticleBean getArticleBean() {
        return articleBean;
    }

    public void setArticleBean(ArticleBean articleBean) {
        this.articleBean = articleBean;
    }
    public String receiveTopXSentences( Article article){
        return cmisService.receiveTopXSentences(article, sentencesNumber);
    }
    public void selectArticle(Article article){
        articleBean.setSelected(article);
        RequestContext.getCurrentInstance().execute("aticleDialog.show()");
    }

}
