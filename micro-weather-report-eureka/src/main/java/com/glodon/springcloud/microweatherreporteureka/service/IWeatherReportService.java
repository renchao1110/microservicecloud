package com.glodon.springcloud.microweatherreporteureka.service;

import com.glodon.springcloud.microweatherreporteureka.pojo.Weather;

/**
 * @Author 【swg】.
 * @Date 2018/11/20 16:01
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public interface IWeatherReportService {
    Weather getDataByCityId(String cityId);
}
