package com.glodon.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：renc
 * @date ：Created in 2019/5/23 10:03
 * @description：${description}
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${from}")
    private String from;


    @GetMapping("/from")
    public String getFrom(){
        return from;
    }
}
