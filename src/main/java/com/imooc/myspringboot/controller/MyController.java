package com.imooc.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
//    将out方法 和“/out”路由绑定
    @RequestMapping("/out")
//    将out的return 输出到客户端浏览器显示
    @ResponseBody
    public String out(){
        return "success``";
    }
}
