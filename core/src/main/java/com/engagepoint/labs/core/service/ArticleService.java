package com.engagepoint.labs.core.service;


import com.engagepoint.labs.core.model.Article;

/**
* @author volodymyr.kozubal  <volodymyr.kozubal@engagepoint.com>
*/
public interface ArticleService {
    /**
     * receive first sentences of article content
     *
     * @param article article object in which content is located {@link Article}
     * @param x  number of sentences
     * @return first x sentences from Article content
     */
    public String receiveTopXSentences(Article article, int x);

    /**
     * create new article
     *
     * @param content new article content
     * @param author  artile's author name
     * @param header  header of the article
     * @return new instance of article object {@link Article}
     */
    public Article createArticle(String content, String author, String header);

    /**
     * creates and add new comment to article
     *
     * @param article article to which coment is added
     * @param body    comment  body
     * @param from    comment author
     * @return succes of operation
     */
    public Boolean addComment(Article article, String body, String from);
}