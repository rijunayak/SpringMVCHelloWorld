package com.thoughtworks.riju;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello.html")
    public ModelAndView helloWorld() {

        return new ModelAndView("hellopage", "message", "HELLO WORLD!");
    }
}
