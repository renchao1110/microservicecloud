package com.glodon.springcloud.serviceprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：renc
 * @date ：Created in 2019/5/21 9:34
 * @description：${description}
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping("/test")
    public String getMessage(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println("88888888888888888888888888888888888888888888888888888888"+service);
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            for (ServiceInstance instance : instances) {
            }
        }
        return "hello world";
    }
}
