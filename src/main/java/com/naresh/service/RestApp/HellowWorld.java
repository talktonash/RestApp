package com.naresh.service.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorld {
    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
}
