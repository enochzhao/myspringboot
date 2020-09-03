package com.imooc.myspringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
//    自动扫描yml配置文件，将对应的key注入进来
    @Value("${mall.config.name}")
    private String name;
    @Value("${mall.config.description}")
    private String description;
    @Value("${mall.config.hot-sales}")
    private Integer hotSales;
    @Value("${mall.config.show-advert}")
    private Boolean showAdvert;

//    将out方法 和“/out”路由绑定
    @RequestMapping("/out")
//    将out的return 输出到客户端浏览器显示
    @ResponseBody
    public String out(){
        return "success``";
    }

    @RequestMapping("/info")
    @ResponseBody
    public String info(){
        return String.format("name:%s,description:%s,hotSales:%s,showAdvert:%s",name,description,hotSales,showAdvert);
    }
}
