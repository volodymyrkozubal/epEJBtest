package com.engagepoint.labs.core.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
