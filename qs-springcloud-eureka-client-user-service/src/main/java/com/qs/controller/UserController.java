package com.qs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Author: huangxincheng
 * 请用一句话描述这个类:
 * <p>
 * <p>
 * 春风十里不如你
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private DiscoveryClient discoveryClient;


    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * 查看当前eureka service信息
     */
    @GetMapping("/instance")
    public List<ServiceInstance> showInfo() {
        return this.discoveryClient.getInstances("USER-SERVICE");
    }


    @GetMapping("/log-instance")
    public void logUtilsInstance() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("UTILS-SERVICE");
        logger.info("{}:{}:{}",
                serviceInstance.getServiceId(),
                serviceInstance.getHost(),
                serviceInstance.getPort());
    }


}
