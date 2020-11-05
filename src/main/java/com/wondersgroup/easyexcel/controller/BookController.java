package com.wondersgroup.easyexcel.controller;

import com.alibaba.excel.EasyExcel;
import com.google.common.collect.Lists;
import com.wondersgroup.easyexcel.dto.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/11/5 11:11
 * @description:
 */
@Controller
public class BookController {
    @GetMapping("/exportExcel")
    public void download(@ApiIgnore HttpServletResponse response) throws IOException {

        List<Book> books = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            books.add(Book.builder().author("author:"+i).title("title:"+i).build());
        }
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode("书单", "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), Book.class).sheet("书单").doWrite(books);
    }
}
