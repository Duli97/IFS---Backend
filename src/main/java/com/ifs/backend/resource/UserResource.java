package com.ifs.backend.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userr")
public class UserResource {

    @GetMapping("/home")
    public String showUser(){
        return "application works";
    }
}
