package com.glodon.springcloud.feignconsumer.controller;

import com.glodon.springcloud.feignconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：renc
 * @date ：Created in 2019/5/22 13:57
 * @description：${description}
 */
@RestController
public class ConsumerController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/feign-consumer")
    public String helloConsumer(){
        return helloService.hello();
    }
}
