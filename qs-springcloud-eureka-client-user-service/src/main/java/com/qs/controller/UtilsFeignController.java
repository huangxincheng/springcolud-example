package com.qs.controller;

import com.qs.domain.Banner;
import com.qs.feign.UtilsFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Date:   2018/6/13 13:37
 * Author: huangxincheng
 * 请用一句话描述这个类:
 *
 * <author>              <time>            <version>          <desc>
 * huangxincheng     2018/6/13 13:37         1.0.0
 * <p>
 * 春风十里不如你
 **/
@RestController
@RequestMapping("/utils-feign")
public class UtilsFeignController {

    @Autowired
    private UtilsFeignClient utilsFeignClient;


    @GetMapping("/queryBanners")
    public List<Banner> queryBanners() {
        return utilsFeignClient.queryBanners();
    }
}
