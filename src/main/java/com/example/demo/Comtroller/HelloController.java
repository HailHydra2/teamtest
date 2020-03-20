package com.example.demo.Comtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello2")
    public String hello(){
        return "hello";
    }

    @RequestMapping("hello3")
    public String hello3(){
        return "helloword";
    }
}
