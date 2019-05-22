package com.glodon.springcloud.ribbonconsumer.controller;

import com.glodon.springcloud.ribbonconsumer.service.HelloserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：renc
 * @date ：Created in 2019/5/21 11:23
 * @description：${description}
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HelloserviceImpl helloservice;
    @GetMapping("/ribbon-consumer")
    public String helloConsumer(){
        /*return restTemplate.getForEntity("http://hello-service/hello/test",String.class).getBody();*/
        return helloservice.helloService();
    }
}
