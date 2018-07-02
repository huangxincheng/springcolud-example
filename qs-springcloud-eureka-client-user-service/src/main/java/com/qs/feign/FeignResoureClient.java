package com.qs.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Author: huangxincheng
 * 请用一句话描述这个类:
 * <p>
 * <p>
 * 春风十里不如你
 **/
@FeignClient(name = "utils-service")
public interface FeignResoureClient extends FeignInterface  {

}
