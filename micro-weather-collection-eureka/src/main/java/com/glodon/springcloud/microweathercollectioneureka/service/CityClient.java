package com.glodon.springcloud.microweathercollectioneureka.service;

import com.glodon.springcloud.microweathercollectioneureka.pojo.City;
import org.springframework.cloud.openfeign.FeignClient;
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
