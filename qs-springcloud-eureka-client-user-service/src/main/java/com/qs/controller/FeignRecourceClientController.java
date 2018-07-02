package com.qs.controller;

import com.qs.domain.Banner;
import com.qs.feign.FeignResoureClient;
import com.qs.feign.UtilsFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: huangxincheng
 * 请用一句话描述这个类:
 * <p>
 * <p>
 * 春风十里不如你
 **/

/**
 * 注意Mapping路径不能出现重复 和 feign 也不能一样
 */
@RestController
public class FeignRecourceClientController {

    @Autowired
    private FeignResoureClient feignResoureClient;

    @RequestMapping("/banner")
    public Banner findBannerOne() {
        Banner banner = feignResoureClient.findBannerOne();
        return banner;
    }
}
