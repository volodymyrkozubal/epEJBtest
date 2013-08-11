package com.engagepoint.labs.core.dao;

import com.engagepoint.labs.core.model.Article;
import com.engagepoint.labs.core.model.Comment;
import org.jsoup.Jsoup;

import javax.swing.text.Document;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* @author volodymyr.kozubal
*/
public class ArticleDaoImpl implements ArticleDao {

    public ArticleDaoImpl() {
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean addComment(Article article, String body, String c_author) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setDate(new Date());
        comment.setC_author(c_author);
        incrementComments(article);
        article.getCommentList().add(comment);
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void incrementComments(Article article) {
        int amount = article.getCommentsamount();
        amount++;
        article.setCommentsamount(amount);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Article createArticle(String content, String author, String header) {
        Article article = new Article();
        article.setCreationDate(new Date());
        article.setContent(content);
        article.setHeader(header);
        article.setAuthor(author);
        return article;
    }

}
