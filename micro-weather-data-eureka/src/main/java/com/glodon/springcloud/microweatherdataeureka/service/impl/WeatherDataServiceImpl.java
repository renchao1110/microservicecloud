package com.glodon.springcloud.microweatherdataeureka.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.glodon.springcloud.microweatherdataeureka.service.IWeatherDataService;
import com.glodon.springcloud.microweatherdataeureka.vo.WeatherResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import java.io.IOException;

/**
 * @Author 【swg】.
 * @Date 2018/11/19 14:46
 * @DESC
 * @CONTACT 317758022@qq.com
 */
@Service
@Slf4j
public class WeatherDataServiceImpl implements IWeatherDataService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";



    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String uri = WEATHER_URI + "citykey="+cityId;

        return doGetWeather(uri);
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String uri = WEATHER_URI + "city="+cityName;

        return doGetWeather(uri);
    }


    private WeatherResponse doGetWeather(String uri){
        //先去缓存中查询，有就直接拿缓存中的数据，否则调用接口
        String key = uri;
        String strBody = null;
        WeatherResponse resp = null;
        ObjectMapper mapper = new ObjectMapper();

        ValueOperations<String,String> ops = stringRedisTemplate.opsForValue();


        if(stringRedisTemplate.hasKey(uri)){
            strBody = ops.get(key);
        }else{
            //缓存没有就抛出异常
            throw new RuntimeException("redis中不存在此数据！");
        }

        try {
            resp = mapper.readValue(strBody,WeatherResponse.class);
        }catch (IOException e){
        }

        return resp;
    }





}
