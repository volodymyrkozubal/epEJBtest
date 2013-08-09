package com.engagepoint.labs.core.dao;

import com.engagepoint.labs.core.model.*;

/**
 * @author volodymyr.kozubal
 */
public interface ArticleDao {

    /**
     * @param article article to which comment is adding
     * @param body    text of comment
     * @param from    comment author
     * @return success of creating comment
     */
    public Boolean addComment(Article article, String body, String from);

    /**
     * create new artile
     *
     * @param content article content
     * @param author  article's author
     * @param header  header
     * @return new {@link Article} object
     */
    public Article createArticle(String content, String author, String header);

    /**
     * increment comment number
     *
     * @param article article where comments are located
     */
    public void incrementComments(Article article);
}
