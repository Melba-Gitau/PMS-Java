package com.app.Property.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/building")
public class BuildController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello I am in building service";
    }

}
