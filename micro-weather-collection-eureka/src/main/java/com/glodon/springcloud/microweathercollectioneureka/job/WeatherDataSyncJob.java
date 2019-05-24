package com.glodon.springcloud.microweathercollectioneureka.job;

import com.glodon.springcloud.microweathercollectioneureka.pojo.City;
import com.glodon.springcloud.microweathercollectioneureka.service.CityClient;
import com.glodon.springcloud.microweathercollectioneureka.service.IWeatherDataCollectionService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 【swg】.
 * @Date 2018/11/19 16:23
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class WeatherDataSyncJob extends QuartzJobBean {
    @Autowired
    private IWeatherDataCollectionService weatherDataCollectionService;
    @Autowired
    private CityClient cityClient;
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        //获取城市列表
        List<City> cityList = null;
        try {
            //TODO
            cityList = cityClient.getCitys();
        } catch (Exception e) {
        }

        //遍历城市id获取天气
        for(City city:cityList){
            String cityId = city.getCityId();
            weatherDataCollectionService.syncDataByCityId(cityId);
        }

    }
}
