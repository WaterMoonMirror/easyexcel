package com.wondersgroup.easyexcel.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/11/12 15:44
 * @description:
 */
@Getter
@AllArgsConstructor
public enum OpType {
    QUERY("查询",1);
    //成员变量
    private String name;
    private int index;
}
