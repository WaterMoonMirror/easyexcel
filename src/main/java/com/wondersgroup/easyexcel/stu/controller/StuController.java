package com.wondersgroup.easyexcel.stu.controller;

import com.wondersgroup.easyexcel.stu.pojo.Stu;
import com.wondersgroup.easyexcel.stu.service.StuService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/12/1 14:56
 * @description:
 */
@RestController
@RequestMapping("stu")
public class StuController {

    @Autowired
    private StuService stuService;

    @GetMapping("query")
    public List<Stu> query(){
        List<Stu> stus = stuService.query();
        return stus;
    }
}
