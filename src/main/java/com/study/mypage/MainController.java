package com.study.mypage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/mypage")
    @ResponseBody
    public String index() {
        return "안녕하세요 ㅎㅇㅎㅇ 반가워용";
    }
}
