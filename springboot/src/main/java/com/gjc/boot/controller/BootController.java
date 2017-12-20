package com.gjc.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guchaochao
 * @date 2017/12/13
 */
@RestController
public class BootController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
