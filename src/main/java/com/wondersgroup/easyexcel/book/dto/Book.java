package com.wondersgroup.easyexcel.book.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("书")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @ExcelProperty(value = "书名")
    @ColumnWidth(12)
    private String title;

    @ExcelProperty(value = "作者")
	@ColumnWidth(8)
    private String author;

}