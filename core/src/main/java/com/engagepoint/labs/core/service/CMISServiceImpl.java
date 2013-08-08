package com.engagepoint.labs.core.service;

import com.engagepoint.labs.core.dao.*;
import com.engagepoint.labs.core.model.Article;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author volodymyr.kozubal
 */

public class CMISServiceImpl implements CMISService {

    private ArticleDao articleDao;
    private static Logger logger = Logger.getLogger(CMISServiceImpl.class.getName());

    private static CMISServiceImpl service = null;

    private CMISServiceImpl() {
        articleDao = new ArticleDaoImpl();
    }

    /**
     * return service instance
     * @return  instance of service layer
     */
    public static CMISServiceImpl getService() {
        if (service == null) {
            service = new CMISServiceImpl();
        }
        return service;
    }

    /**
     * {@inheritDoc}
     */
    public String receiveTopXSentences(Article article, int number) {
        return articleDao.receiveTopXSentences(article, number);
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
    public Boolean addComment(Article article, String body, String from) {
        return articleDao.addComment(article, body, from);
    }

}