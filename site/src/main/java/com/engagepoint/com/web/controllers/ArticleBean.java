package com.engagepoint.com.web.controllers;

import com.engagepoint.labs.core.model.Article;
import com.engagepoint.labs.core.service.CMISService;
import com.engagepoint.labs.core.service.CMISServiceImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;
import java.io.Serializable;

/**
 * @author volodymyr.kozubal
 */
@ManagedBean(name = "articleBean")
@SessionScoped
public class ArticleBean implements Serializable {
    private String content;
    private String author;
    private String header;
    private int commentsamount;
    private Article selected;
    private CMISService cmisService;

    @ManagedProperty(value = "#{commentBean}")
    private CommentBean commentBean;

    public ArticleBean(){
        cmisService = CMISServiceImpl.getService();
    }

    public CommentBean getCommentBean() {
        return commentBean;
    }

    public void setCommentBean(CommentBean commentBean) {
        this.commentBean = commentBean;
    }

    public Boolean addComment(){
        return cmisService.addComment(selected,commentBean.getBody() , commentBean.getFrom() );
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public int getCommentsamount() {
        return commentsamount;
    }

    public void setCommentsamount(int commentsamount) {
        this.commentsamount = commentsamount;
    }

    public void setSelected(Article selected) {
        this.selected = selected;
    }

    public Article getSelected() {
        return selected;
    }

}
