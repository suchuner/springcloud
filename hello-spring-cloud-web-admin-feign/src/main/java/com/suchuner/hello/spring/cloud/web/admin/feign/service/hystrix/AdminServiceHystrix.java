package com.suchuner.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.suchuner.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author suchuner
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("你请求的消息是%s,请求失败。",message);
    }
}
