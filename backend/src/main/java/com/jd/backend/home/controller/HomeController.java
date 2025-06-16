package com.jd.backend.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // static 폴더 아래 index.html로 포워드
        return "forward:/index.html";
    }

}
