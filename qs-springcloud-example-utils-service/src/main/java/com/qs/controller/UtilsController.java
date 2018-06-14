package com.qs.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.qs.domain.Banner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Autowired
    private EurekaClient eurekaClient;

    private static Logger logger = LoggerFactory.getLogger(UtilsController.class);

    @GetMapping("/instance")
    public List<InstanceInfo> showInfo() {
        List<ServiceInstance> instances = this.discoveryClient.getInstances("utils-service");
        List<String> services = this.discoveryClient.getServices();
        List<InstanceInfo> list = this.eurekaClient.getInstancesById("utils-service:[192.168.9.104:8081]");
        return list;
    }

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/queryBanners")
    public List<Banner> queryBanners() {
        logger.info("当前端口: {}", serverPort);
        return Banner.initBanners();
    }
}
