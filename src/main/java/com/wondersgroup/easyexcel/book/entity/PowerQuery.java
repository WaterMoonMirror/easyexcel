package com.wondersgroup.easyexcel.book.entity;

import lombok.Data;

@Data
public class PowerQuery {
    /**
     * ALL-全部
     * 其他值-无效
     */
    private String type;

    /**
     * 0-内部
     * 1-外部
     */
    private Integer userType;

    /**
     * 如果不是ALL角度查看
     * 外部用户一次只能查看一个权限
     */
    private String powerName;
}