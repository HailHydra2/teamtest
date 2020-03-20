package com.example.demo.Pojo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LchHello {

    @RequestMapping("hello4")
    public String hello3(){
        return "helloword";
    }


}
