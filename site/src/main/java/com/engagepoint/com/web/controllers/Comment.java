package com.engagepoint.com.web.controllers;

import lombok.Data;

import javax.persistence.Embeddable;
import java.util.Date;

/**
 * @author volodymyr.kozubal
 */
@Embeddable
@Data
public class Comment {
    private String body;
    private Date date;
    private String from;
}
