package com.engagepoint.labs.core.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
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
