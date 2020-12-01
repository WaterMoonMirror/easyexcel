package com.wondersgroup.easyexcel.book.service.impl;

import com.wondersgroup.easyexcel.book.entity.Article;
import com.wondersgroup.easyexcel.book.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/11/10 18:19
 * @description:
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public List<Article> queryArticles() {
        return null;
    }

    @Override
    public int addArticle(Article article) {
        return 0;
    }

    @Override
    public Article getArticleById(int id) {
        return null;
    }

    @Override
    public int deleteArticleById(int id) {
        return 0;
    }
}
