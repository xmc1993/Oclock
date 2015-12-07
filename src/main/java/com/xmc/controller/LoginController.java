package com.xmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015/12/4.
 */

@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/login")
    public String login(ModelMap modelMap){
        modelMap.put("test", "test");
        return "index";
    }

    @RequestMapping("/rest")
    public void restFul(ModelMap modelMap){
        modelMap.put("name", "xmc1993");
    }
}
