package com.wondersgroup.easyexcel.stu.controller;

import com.wondersgroup.easyexcel.stu.pojo.Stu;
import com.wondersgroup.easyexcel.stu.service.StuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "测试接口",tags = {"用户测试相关的接口"})
@RestController
@RequestMapping("stu")
public class StuController {

    @Autowired
    private StuService stuService;

    @ApiOperation(value = "查询全部数据",notes = "查询全部数据",httpMethod = "GET")
    @GetMapping("query")
    public List<Stu> query(){
        List<Stu> stus = stuService.query();
        return stus;
    }
}
