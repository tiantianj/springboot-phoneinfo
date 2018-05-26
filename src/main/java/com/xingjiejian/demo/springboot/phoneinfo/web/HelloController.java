package com.xingjiejian.demo.springboot.phoneinfo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xing.Jiejian
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
