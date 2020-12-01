package com.wondersgroup.easyexcel.book.dao;

import com.wondersgroup.easyexcel.book.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/11/10 18:13
 * @description:
 */
public interface ArticleDao  extends JpaRepository<Article,Integer> {
}
