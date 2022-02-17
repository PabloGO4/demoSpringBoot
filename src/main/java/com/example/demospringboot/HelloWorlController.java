package com.example.demospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorlController {

    @RequestMapping("/")
    String index() {
        return "Hola, guapetón";
    }


}