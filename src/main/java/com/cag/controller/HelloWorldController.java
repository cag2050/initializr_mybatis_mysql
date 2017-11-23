package com.cag.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = {"/", ""}, method = {RequestMethod.POST, RequestMethod.GET}, produces = "application/json; charset=UTF-8")
    public String helloWorld() {
        return "{\"eedddd\":\"dddddd world\"}";
    }
}