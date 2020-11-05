package com.wondersgroup.easyexcel.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import sun.rmi.runtime.Log;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/11/5 15:05
 * @description:
 */
public interface BookDao  extends JpaRepository<BookEntity, Log> {
}
