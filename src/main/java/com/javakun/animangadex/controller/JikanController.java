package com.javakun.animangadex.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-world")
public class JikanController {

    public String helloWorld() {
        return "Hello World!";
    }
}
