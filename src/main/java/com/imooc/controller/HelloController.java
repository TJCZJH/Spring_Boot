package com.imooc.controller;

import com.imooc.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhao
 * @version 1.0
 * @date 2019-08-21 16:41
 */
@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello(){
        return "hello zhao";
    }

//    @RequestMapping("/getResource")
}
