package com.xiaoxiaofengsi.fengfeng_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShangchenConfController {

    @RequestMapping("/about")
    public String about(){
        return "shangchen/about";
    }

    @RequestMapping("/affiliate")
    public String affiliate(){
        return "shangchen/Affiliate";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "shangchen/Contact";
    }

    @RequestMapping("/exhibition")
    public String exhibition(){
        return "shangchen/Exhibition";
    }

    @RequestMapping("/login")
    public String login(){
        return "shangchen/login";
    }

    @RequestMapping("/milk_tea")
    public String milk_tea(){
        return "shangchen/Milk_tea";
    }

    @RequestMapping("/msg")
    public String msg(){
        return "shangchen/msg";
    }

    @RequestMapping("/news")
    public String news(){
        return "shangchen/News";
    }

    @RequestMapping("/newshow")
    public String newshow(){
        return "shangchen/newshow";
    }

    @RequestMapping("/reg")
    public String reg(){
        return "shangchen/reg";
    }

    @RequestMapping("/services")
    public String services(){
        return "shangchen/Services";
    }
}
