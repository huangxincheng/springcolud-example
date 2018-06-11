package com.qs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: huangxincheng
 * 请用一句话描述这个类:
 * <p>
 * <p>
 * 春风十里不如你
 **/
@SpringBootApplication
@EnableEurekaClient
public class UtilsApplication {


    public static void main(String[] args) {
        SpringApplication.run(UtilsApplication.class, args);
    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping
    public String hello() {
        return "utils hello world";
    }
}
