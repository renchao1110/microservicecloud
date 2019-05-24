package com.glodon.springcloud.microweatherreporteureka.controller;

import com.glodon.springcloud.microweatherreporteureka.pojo.City;
import com.glodon.springcloud.microweatherreporteureka.service.CityClient;
import com.glodon.springcloud.microweatherreporteureka.service.IWeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author 【swg】.
 * @Date 2018/11/20 16:03
 * @DESC
 * @CONTACT 317758022@qq.com
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {
    @Autowired
    private IWeatherReportService weatherReportService;
    @Autowired
    private CityClient cityClient;
    @GetMapping("/cityId/{cityId}")
    public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception {
        List<City> cityList = cityClient.getCitys();
        model.addAttribute("title","蜗牛天气预报");
        model.addAttribute("cityId",cityId);
        model.addAttribute("cityList",cityList);
        model.addAttribute("report",weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report","reportModel",model);
    }

}
