package com.xiaoxiaofengsi.fengfeng_management.controller;

import com.xiaoxiaofengsi.fengfeng_backstage.serviceapi.IUserFirstServiceApi;
import com.xiaoxiaofengsi.fengfeng_backstage.waientity.Message;
import com.xiaoxiaofengsi.fengfeng_backstage.waientity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    //依赖注入
    @Autowired
    private IUserFirstServiceApi  iUserFirstServiceApi;

    @RequestMapping("index")
    public String home(Model model){
        List<Map> jobList = new ArrayList();
        Map map1 = new HashMap();
        map1.put("budgetId","1");
        map1.put("budgetName","小于10000");
        Map map2 = new HashMap();
        map2.put("budgetId","2");
        map2.put("budgetName","大于10000");
        jobList.add(map1);
        jobList.add(map2);
        model.addAttribute("budgetList",jobList);
        return "shangchen/index";
    }

    @ResponseBody
    @RequestMapping("/submitMessage")
    public Map submitMessage(Message message){
        Map map = new HashMap();
        iUserFirstServiceApi.insertMessage(message);
        map.put("rspCode","1");
        return map;
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
