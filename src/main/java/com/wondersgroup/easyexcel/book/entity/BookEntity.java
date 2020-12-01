package com.wondersgroup.easyexcel.book.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/11/5 14:52
 * @description:
 */
@Table
@Entity
@Data
public class BookEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String author;
    private String title;
}
