package com.study.mypage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloContorller {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}
