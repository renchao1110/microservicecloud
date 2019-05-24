package com.glodon.springcloud.microweathercityeureka.service;

import com.glodon.springcloud.microweathercityeureka.pojo.City;

import java.util.List;

/**
 * @Author 【swg】.
 * @Date 2018/11/19 17:13
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public interface ICityDataService {
    List<City> listCity() throws Exception;
}
