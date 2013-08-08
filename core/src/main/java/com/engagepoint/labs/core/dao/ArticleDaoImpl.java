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
     * parse plain text from html
     * @param html  html text to parse
     * @return     plain text
     */
    private String parsToTest (String html){
        return Jsoup.parse(html).body().text();
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean addComment(Article article, String body, String from){
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setDate(new Date());
        comment.setFrom(from);
        incrementComments(article);
        article.getCommentList().add(comment);
      return true;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void incrementComments(Article article){
        int amount = article.getCommentsamount();
        amount++;
        article.setCommentsamount(amount);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String receiveTopXSentences(Article article, int number) {
        String content = article.getContent();
        String text= parsToTest(content);
        BreakIterator boundary = BreakIterator.getSentenceInstance();
        boundary.setText(text);
        List<String> sentences = new ArrayList<String>();
        int start = boundary.first();
        int end = boundary.next();
        while (end != BreakIterator.DONE && number>0) {
            String sentence = text.substring(start, end).trim();
            if (!sentence.isEmpty()) {
                sentences.add(sentence);
                number--;
            }
            start = end;
            end = boundary.next();
        }

        return sentences.toString();
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
