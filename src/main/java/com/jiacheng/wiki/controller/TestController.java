package com.jiacheng.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// 用于返回String的注解，用于前后端分离
@RestController
public class TestController {

    /**
     * Restful风格
     * GET查询, POST新增, PUT修改, DELETE删除
     * 增删改查
     * 浏览器直接访问的是GET请求
     * @return
     */
    // 这个接口的请求地址,指定支持Get
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }
}
