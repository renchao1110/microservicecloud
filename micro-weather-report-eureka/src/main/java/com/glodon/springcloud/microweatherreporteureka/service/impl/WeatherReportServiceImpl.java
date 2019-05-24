package com.glodon.springcloud.microweatherreporteureka.service.impl;

import com.glodon.springcloud.microweatherreporteureka.pojo.Weather;
import com.glodon.springcloud.microweatherreporteureka.service.IWeatherReportService;
import com.glodon.springcloud.microweatherreporteureka.service.WeatherDataClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class WeatherReportServiceImpl implements IWeatherReportService {

    @Autowired
    private WeatherDataClient weatherDataClient;
    @Override
    public Weather getDataByCityId(String cityId) {
        Weather weather = weatherDataClient.getWeatherByCityId(cityId).getData();
        return weather;
    }
}
