package com.wondersgroup.easyexcel.book.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.base.IEntity;
import lombok.Data;

import java.util.Date;

@FluentMybatis
@Data
public class HelloWorldEntity implements IEntity {
    private Long id;

    private String sayHello;

    private String yourName;

    private Date gmtCreate;

    private Date gmtModified;

    private Boolean isDeleted;
    
    // get, set, toString 方法
}