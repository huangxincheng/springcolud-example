package com.qs.controller;

import com.qs.domain.Banner;
import com.qs.feign.FeignInterface;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: huangxincheng
 * 请用一句话描述这个类:
 * <p>
 * <p>
 * 春风十里不如你
 **/
@RestController
public class FeignResourceController implements FeignInterface {

    @Override
    public Banner findBannerOne() {
        Banner banner = new Banner();
        banner.setBannerId(123345567L);
        banner.setHeigth(1);
        banner.setWidth(1);
        banner.setSize(1);
        return banner;
    }
}
