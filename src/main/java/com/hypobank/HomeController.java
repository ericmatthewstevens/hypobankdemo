package com.hypobank;

import org.springframework.stereotype.Controller;

@Controller // @Controller will mark this class as a Spring MVC Controller
public class HomeController {
    
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
