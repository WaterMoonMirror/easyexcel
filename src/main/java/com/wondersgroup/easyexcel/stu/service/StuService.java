package com.wondersgroup.easyexcel.stu.service;

import com.wondersgroup.easyexcel.stu.mapper.StuMapper;
import com.wondersgroup.easyexcel.stu.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/12/1 14:54
 * @description:测试服务
 */
@Service
public class StuService {

    @Autowired
    private StuMapper stuMapper;

    /**
     *  查询全部数据
     * @return
     */
    public List<Stu> query(){
        List<Stu> stus = stuMapper.selectAll();
        return stus;
    }
}
