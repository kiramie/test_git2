package com.kiramie.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/git1")
    public String me01(){
        return "TEST FOR GIT";//项目经理注释 18点20分
    }
    @RequestMapping("/git2")
    public String me02(){
        return "TEST FOR GIT2";//开发者no1486的备注
    }
}
