package com.qs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Date:   2018/5/28 19:31
 * Author: huangxincheng
 * 请用一句话描述这个类:
 *
 * <author>              <time>            <version>          <desc>
 * huangxincheng     2018/5/28 19:31         1.0.0
 * <p>
 * 春风十里不如你
 **/
@SpringBootApplication
@EnableEurekaServer
//扫描排除带有SpringBootApplication注解的configuration
//@ComponentScan(excludeFilters = {@ComponentScan.Filter(type=FilterType.ANNOTATION, value = SpringBootApplication.class)})
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
