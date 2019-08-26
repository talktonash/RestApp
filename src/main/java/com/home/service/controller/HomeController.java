package com.home.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("test")
    public String home(){

        //ModelAndView mv = new ModelAndView();
        //mv.addObject("obj", alien);
        //mv.setViewName("home");
        //return mv;
        return "home.jsp";
    }
}
