package com.wondersgroup.easyexcel.stu.controller;

import com.wondersgroup.easyexcel.commoin.RedisOperator;
import com.wondersgroup.easyexcel.stu.pojo.Stu;
import com.wondersgroup.easyexcel.stu.service.StuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/12/1 14:56
 * @description:
 */
@Api(value = "测试接口",tags = {"用户测试相关的接口"})
@RestController
@RequestMapping("stu")
@Slf4j
public class StuController {

    @Autowired
    private RedisOperator redisOperator;
    @Autowired
    private StuService stuService;

    @ApiOperation(value = "查询全部数据",notes = "查询全部数据",httpMethod = "GET")
    @GetMapping("query")
    public List<Stu> query(HttpServletRequest request){
        HttpSession session = request.getSession();
        redisOperator.set("name","1234");
        session.setAttribute("name123","123456");
        log.info(redisOperator.get("name"));
        log.info(redisOperator.get("name123"));
        List<Stu> stus = stuService.query();
        return stus;
    }
}
