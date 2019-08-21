package com.imooc.controller;

import com.imooc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author zhao
 * @version 1.0
 * @date 2019-08-21 17:08
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    @ResponseBody
    public User hello(){
        User user = new User();
        user.setName("zhao");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setPassword("123");
        user.setDesc("");
        return user;
    }
}
