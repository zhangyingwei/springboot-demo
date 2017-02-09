package com.zhangyingwei.sb.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangyingwei1@chanct.com
 * @date: 2017/2/8
 * @time: 11:44
 * @desc:
 */

@RestController
@SpringBootApplication
@ComponentScan("com.zhangyingwei.sb.*")
public class App {

    @RequestMapping("/")
    public String hello(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
