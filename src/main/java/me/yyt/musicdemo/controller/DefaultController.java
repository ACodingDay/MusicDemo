package me.yyt.musicdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yyt
 * @date 2022年06月12日 20:05
 * @desc 默认
 */
@RestController
@RequestMapping("/hello")
public class DefaultController {

    @GetMapping
    public String sayHello() {
        return "Hello";
    }
}
