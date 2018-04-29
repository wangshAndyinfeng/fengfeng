package com.xiaoxiaofengsi.fengfeng_management.controller;

import com.xiaoxiaofengsi.fengfeng_backstage.serviceapi.IUserFirstServiceApi;
import com.xiaoxiaofengsi.fengfeng_backstage.waientity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    //依赖注入
    @Autowired
    private IUserFirstServiceApi iUserFirstServiceApi;

    @RequestMapping("/login")
    public String home(){
        return "home/index";
    }


    @RequestMapping("/insertUser")
    public String insertUser(){
        User user = new User();
        user.setUserId(123345);
        user.setUsername("wsh");
        user.setPassword("123456");
        user.setRemark("第一次该springboot使用数据库");
        iUserFirstServiceApi.insert(user);
        return "11111111";
    }
}
