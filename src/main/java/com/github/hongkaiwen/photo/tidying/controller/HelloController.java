package com.github.hongkaiwen.photo.tidying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
@RequestMapping(produces={"application/json;charset=utf-8"}, value="/")
public class HelloController {

    @GetMapping
    public String index(){
        return "/hello";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(HttpServletRequest request) throws IOException {
        String fileName = request.getHeader("X_FILENAME");
        File target = new File("e:/temp/ft/test/" + fileName);
        FileCopyUtils.copy(request.getInputStream(), new FileOutputStream(target));
        return "xxx";
    }

}
