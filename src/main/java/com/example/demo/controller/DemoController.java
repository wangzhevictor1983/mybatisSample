package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value="/sample", method=RequestMethod.GET)
    public String sample(@RequestParam(value="name", defaultValue="World") String name) {
    		return "Hello world!";
    }
}
