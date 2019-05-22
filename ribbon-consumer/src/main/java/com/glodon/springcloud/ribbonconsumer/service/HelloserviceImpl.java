package com.glodon.springcloud.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：renc
 * @date ：Created in 2019/5/22 9:46
 * @description：${description}
 */
@Service
public class HelloserviceImpl {
    @Autowired
    private RestTemplate template;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService(){
        return template.getForEntity("http://hello-service/hello/test",String.class).getBody();
    }

    public String helloFallback(){
        return "error";
    }
}
