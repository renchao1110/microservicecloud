package com.glodon.springcloud.microweatherreporteureka.service;

import com.glodon.springcloud.microweatherreporteureka.pojo.City;
import com.glodon.springcloud.microweatherreporteureka.vo.WeatherResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author ：renc
 * @date ：Created in 2019/5/23 16:47
 * @description：${description}
 */
@FeignClient("micro-weather-data-eureka")
public interface WeatherDataClient {

    @GetMapping("/weather/cityId/{cityId}")
    WeatherResponse getWeatherByCityId(@PathVariable("cityId") String cityId);

    @GetMapping("/weather/cityName/{cityName}")
    WeatherResponse getWeatherByCityName(@PathVariable("cityName") String cityName);
}
