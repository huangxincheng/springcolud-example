package com.qs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: huangxincheng
 * 请用一句话描述这个类:
 * <p>
 * <p>
 * 春风十里不如你
 **/
@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/app")
public class UtilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UtilsApplication.class, args);
    }


    @RequestMapping
    public String hello() {
        return "utils hello world";
    }
}
