package com.glodon.springcloud.microweatherdataeureka.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 【swg】.
 * @Date 2018/11/19 14:33
 * @DESC 昨天天气
 * @CONTACT 317758022@qq.com
 */
@Data
public class Yesterday implements Serializable{
    private String date;
    private String high;
    private String fx;
    private String low;
    private String fl;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }
}
