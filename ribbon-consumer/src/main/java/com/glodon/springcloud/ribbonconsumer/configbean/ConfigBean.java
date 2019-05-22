package com.glodon.springcloud.ribbonconsumer.configbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：renc
 * @date ：Created in 2019/5/21 11:18
 * @description：配置类
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
