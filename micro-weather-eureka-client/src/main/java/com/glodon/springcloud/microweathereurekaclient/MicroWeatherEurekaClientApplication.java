package com.glodon.springcloud.microweathereurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroWeatherEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherEurekaClientApplication.class, args);
    }

}
