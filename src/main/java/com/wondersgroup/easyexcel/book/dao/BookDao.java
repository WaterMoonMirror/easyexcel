package com.wondersgroup.easyexcel.book.dao;

import com.wondersgroup.easyexcel.book.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/11/5 15:05
 * @description:
 */
public interface BookDao  extends JpaRepository<BookEntity, Long> {
}
