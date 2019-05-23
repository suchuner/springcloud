package com.suchuner.hello.web.admin.ribbon.controller;

import com.suchuner.hello.web.admin.ribbon.service.AdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suchuner
 */
@RestController
public class AdminController {
    @Autowired
    private AdminServer adminServer;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(String message){
       return adminServer.sayHi(message);
    }
}
