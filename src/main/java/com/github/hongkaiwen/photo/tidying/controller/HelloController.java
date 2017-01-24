package com.github.hongkaiwen.photo.tidying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(produces={"application/json;charset=utf-8"}, value="/")
public class HelloController {

    @GetMapping
    public String index(){
        return "/hello";
    }

}
