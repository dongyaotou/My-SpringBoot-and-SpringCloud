package com.funtl.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zyq on 2020/6/21.
 */
@RestController
public class AdminController {
   //下面使用Spring的el表达式，进行注入，读取的是该模块下的application.yml配置文件中为该服务设置的端口号
    @Value("${server.port}")
    private String port;
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(String message){
        //String对象占位的写法
        return String.format("HI your message is :%s port:%s",message,port);
    }

}
