package com.engagepoint.com.web.controllers;

import lombok.Data;

import javax.persistence.Embeddable;
<<<<<<< HEAD:core/src/main/java/com/engagepoint/labs/core/model/Comment.java
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
=======
>>>>>>> 6b813e8640aab0961d71afad92be8d96be049027:site/src/main/java/com/engagepoint/com/web/controllers/Comment.java
import java.util.Date;

/**
 * @author volodymyr.kozubal
 */
@Embeddable
@Data
public class Comment {
    private String body;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private String c_author;
}
