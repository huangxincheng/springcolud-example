package com.qs.feign;

import com.qs.domain.Banner;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Date:   2018/6/11 18:45
 * Author: huangxincheng
 * 请用一句话描述这个类:
 *
 * <author>              <time>            <version>          <desc>
 * huangxincheng     2018/6/11 18:45         1.0.0
 * <p>
 * 春风十里不如你
 **/
@FeignClient(name = "util-service")
public interface UtilsFeignClient {

    @RequestMapping(value = "/utils/queryBanners", method = RequestMethod.GET)
    List<Banner> queryBanners();

}
