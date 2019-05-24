package com.glodon.springcloud.microweatherreporteureka.service;

import com.glodon.springcloud.microweatherreporteureka.pojo.City;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author ：renc
 * @date ：Created in 2019/5/23 16:47
 * @description：${description}
 */
@FeignClient("micro-weather-city-eureka")
public interface CityClient {

    @GetMapping("/cities")
    List<City> getCitys();
}
