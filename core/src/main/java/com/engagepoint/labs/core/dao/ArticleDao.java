package com.engagepoint.labs.core.dao;

import com.engagepoint.labs.core.model.*;

/**
 * @author volodymyr.kozubal
 */
public interface ArticleDao {

    /**
     * Get top x sentences from article {@link Article} content
     *
     * @param x       number of sentences to receive
     * @param article from which content  is received
     * @return first x sentences from Article content
     */
    public String receiveTopXSentences(Article article, int x);

    /**
     * @param article  article to which comment is adding
     * @param body    text of comment
     * @param from    comment author
     * @return     success of creating comment
     */
    public Boolean addComment(Article article, String body, String from);

    /**
     * create new artile
     * @param content    article content
     * @param author    article's author
     * @param header    header
     * @return          new {@link Article} object
     */
    public Article createArticle(String content, String author, String header);

    /**
     * increment comment number
     * @param article  article where comments are located
     */
    public void incrementComments(Article article);
}
