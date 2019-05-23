package com.suchuner.hello.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author suchuner
 */
@Service
public class AdminServer {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(@RequestParam String message){
      return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message="+message,String.class);
    }
    public String hiError(String message){
        return String.format("你请求的消息是%s,请求失败。",message);
    }
}
