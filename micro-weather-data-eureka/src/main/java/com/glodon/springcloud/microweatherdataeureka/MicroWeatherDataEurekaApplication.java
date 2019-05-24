package com.glodon.springcloud.microweatherdataeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroWeatherDataEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherDataEurekaApplication.class, args);
    }

}
