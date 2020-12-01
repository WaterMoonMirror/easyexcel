package com.wondersgroup.easyexcel.book.controller;

import com.alibaba.excel.EasyExcel;
import com.google.common.collect.Lists;
import com.wondersgroup.easyexcel.annotation.Log;
import com.wondersgroup.easyexcel.annotation.OpLog;
import com.wondersgroup.easyexcel.book.dto.Book;
import com.wondersgroup.easyexcel.book.dao.BookDao;
import com.wondersgroup.easyexcel.book.entity.BookEntity;
import com.wondersgroup.easyexcel.enums.OpType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/11/5 11:11
 * @description:
 */
@Controller
public class BookController {

    @Autowired
    private BookDao bookDao;

    @PostMapping("/book")
    @ResponseBody
    @Log
    public BookEntity save(BookEntity bookEntity){
        bookEntity=bookDao.save(bookEntity);
        return bookEntity;
    }

    @GetMapping("/book")
    @ResponseBody
    @OpLog(opType = OpType.QUERY, opItem = "order", opItemIdExpression = "#id")
    public List<BookEntity> query(){
        List<BookEntity> books = bookDao.findAll();
        return books;
    }

    @GetMapping("/exportExcel")
    public void download(@ApiIgnore HttpServletResponse response) throws IOException {

        List<Book> books = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            books.add(Book.builder().author("author:" + i).title("title:" + i).build());
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
