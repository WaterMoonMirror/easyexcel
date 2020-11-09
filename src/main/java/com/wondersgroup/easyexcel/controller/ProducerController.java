package com.wondersgroup.easyexcel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProducerController {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    @GetMapping("send" )
    @ResponseBody
    public String send( String message) {
        System.out.println(message);
        kafkaTemplate.send("topicTEST", message); //使用kafka模板发送信息
        return "success";
    }
}