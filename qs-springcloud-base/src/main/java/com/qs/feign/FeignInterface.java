package com.qs.feign;

import com.qs.domain.Banner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Author: huangxincheng
 * 请用一句话描述这个类:
 * <p>
 * <p>
 * 春风十里不如你
 **/
//feign 不支持在这里写ReqeustMapping
@RequestMapping("/feign")
public interface FeignInterface {

   @RequestMapping(method = RequestMethod.GET, value = "/banner")
   Banner findBannerOne();
}
