package com.engagepoint.com.web.controllers;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * @author volodymyr.kozubal
 */
@ManagedBean(name = "commentBean")
@RequestScoped

public @Data class  CommentBean implements Serializable{
    private String body;
    private String from;
}
