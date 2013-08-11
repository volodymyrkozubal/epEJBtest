package com.engagepoint.labs.core.model;

import lombok.extern.java.Log;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author volodymyr.kozubal
 */

@Stateless
@Log
public class ArticleEJB {
    // ======================================
    // =             Attributes             =
    // ======================================

    @PersistenceContext(unitName = "blog")
    private EntityManager em;

    // ======================================
    // =           Public Methods           =
    // ======================================

    public List<Article> findArticles() {
        TypedQuery<Article> query = em.createNamedQuery("findAllArticles", Article.class);
        return query.getResultList();
    }

    public Article createArticle(Article article) {
        em.persist(article);
        return article;
    }
}
