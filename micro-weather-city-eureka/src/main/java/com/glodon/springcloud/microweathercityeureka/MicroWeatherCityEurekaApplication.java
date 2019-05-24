package com.glodon.springcloud.microweathercityeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroWeatherCityEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherCityEurekaApplication.class, args);
    }

}
