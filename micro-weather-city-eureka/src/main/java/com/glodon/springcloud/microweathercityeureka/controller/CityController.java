package com.glodon.springcloud.microweathercityeureka.controller;

import com.glodon.springcloud.microweathercityeureka.pojo.City;
import com.glodon.springcloud.microweathercityeureka.service.ICityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 【swg】.
 * @Date 2018/11/21 11:49
 * @DESC
 * @CONTACT 317758022@qq.com
 */
@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private ICityDataService cityDataService;

    @GetMapping
    public List<City> listCity() throws Exception {
        return cityDataService.listCity();
    }

}
