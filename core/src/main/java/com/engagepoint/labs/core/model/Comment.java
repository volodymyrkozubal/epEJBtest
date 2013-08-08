package com.engagepoint.labs.core.model;

import java.util.Date;

/**
 * @author volodymyr.kozubal
 */
public class Comment {
    private String body;
    private Date date;
    private String from;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

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
