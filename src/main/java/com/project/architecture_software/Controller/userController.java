package com.project.architecture_software.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class userController {
    @GetMapping("list_user")
    public String list_user(){
        return "Holi profe christian";
    }
}