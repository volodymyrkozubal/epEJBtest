package com.engagepoint.labs.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author volodymyr.kozubal
 */
public class Article {
    private Date creationDate;
    private String content;
    private int commentsamount;
    private String author;
    private String header;
    List<Comment> commentList;

    public Article() {
        commentList = new ArrayList<Comment>();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCommentsamount() {
        return commentsamount;
    }

    public void setCommentsamount(int commentsamount) {
        this.commentsamount = commentsamount;
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

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
