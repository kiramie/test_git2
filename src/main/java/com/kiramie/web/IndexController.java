package com.kiramie.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/git1")
    public String me01(){
        return "TEST FOR GIT";
    }
}
