package com.engagepoint.com.web.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * @author volodymyr.kozubal
 */
@ManagedBean(name = "commentBean")
@SessionScoped
public class CommentBean implements Serializable{
    private String body;
    private String from;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

}
