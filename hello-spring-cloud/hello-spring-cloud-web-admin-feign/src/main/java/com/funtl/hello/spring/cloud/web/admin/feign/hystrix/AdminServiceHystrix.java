package com.funtl.hello.spring.cloud.web.admin.feign.hystrix;

import com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * Created by zyq on 2020/6/23.
 * 创建熔断器类并实现对应的 Feign 接口
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "HI,your message is :\""+message+"\"+but request error.";
    }
}
