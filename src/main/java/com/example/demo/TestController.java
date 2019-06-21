package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: LiHui
 * @Description:
 * @Date: Created in 2019/6/21
 **/
@Controller
public class TestController {
    @RequestMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "HelloWorld";
    }
}
