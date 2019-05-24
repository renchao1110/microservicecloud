package com.glodon.springcloud.microweatherreporteureka.vo;

import com.glodon.springcloud.microweatherreporteureka.pojo.Weather;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author 【swg】.
 * @Date 2018/11/19 14:42
 * @DESC
 * @CONTACT 317758022@qq.com
 */
@Data
public class WeatherResponse implements Serializable {
    private Weather data;
    private Integer status;
    private String desc;

    public Weather getData() {
        return data;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
