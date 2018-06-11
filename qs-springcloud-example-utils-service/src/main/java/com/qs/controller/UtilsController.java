package com.qs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Date:   2018/6/11 16:43
 * Author: huangxincheng
 * 请用一句话描述这个类:
 *
 * <author>              <time>            <version>          <desc>
 * huangxincheng     2018/6/11 16:43         1.0.0
 * <p>
 * 春风十里不如你
 **/
@RestController
@RequestMapping("/utils")
public class UtilsController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/instance")
    public List<ServiceInstance> showInfo() {
        return this.discoveryClient.getInstances("user-service");
    }
}
