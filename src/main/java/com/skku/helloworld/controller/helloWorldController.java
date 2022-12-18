package com.skku.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/hello")
public class helloWorldController {
    @GetMapping
    public String getHelloWorldPage(Model model){
        model.addAttribute("msg", "Hello world");
        return "hello";
    }
}
