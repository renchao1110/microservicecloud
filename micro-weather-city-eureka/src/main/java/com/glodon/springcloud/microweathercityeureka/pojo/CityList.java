package com.glodon.springcloud.microweathercityeureka.pojo;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @Author 【swg】.
 * @Date 2018/11/19 17:07
 * @DESC
 * @CONTACT 317758022@qq.com
 */
@Data
@XmlRootElement(name = "c")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityList {
    @XmlElement(name = "d")
    private List<City> cityList;

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
}
