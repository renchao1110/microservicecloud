package com.glodon.springcloud.microweatherreporteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MicroWeatherReportEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherReportEurekaApplication.class, args);
    }

}
