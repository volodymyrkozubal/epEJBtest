package com.engagepoint.labs.core.service;

import com.engagepoint.labs.core.dao.*;

import com.engagepoint.labs.core.model.Article;
import org.jsoup.Jsoup;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
* @author volodymyr.kozubal
*/

public class ArticleServiceImpl implements ArticleService {

    private ArticleDao articleDao;
    private static Logger logger = Logger.getLogger(ArticleServiceImpl.class.getName());

    private static ArticleServiceImpl service = null;

    private ArticleServiceImpl() {
        articleDao = new ArticleDaoImpl();
    }

    /**
     * return service instance
     * @return  instance of service layer
     */
    public static ArticleServiceImpl getService() {
        if (service == null) {
            service = new ArticleServiceImpl();
        }
        return service;
    }

    /**
     * {@inheritDoc}
     */
    public Article createArticle(String content, String author, String header) {
        return articleDao.createArticle(content, author, header);
    }

    /**
     * {@inheritDoc}
     */
    public Boolean addComment(Article article, String body, String c_author) {
        return articleDao.addComment(article, body, c_author);
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


}