package com.glodon.springcloud.feignconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：renc
 * @date ：Created in 2019/5/22 13:55
 * @description：${description}
 */
@FeignClient("hello-service")
public interface HelloService {
    @GetMapping("/hello/test")
    String hello();
}
