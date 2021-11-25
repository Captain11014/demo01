package org.soft.base.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestCobtroller {

    @RequestMapping("hello")
    public String test(){
        return "hello spring security!";
    }

}
