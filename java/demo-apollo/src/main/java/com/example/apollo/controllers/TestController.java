/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.example.apollo.controllers;

import com.example.apollo.common.AppConfig;
import com.example.apollo.common.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2019/7/2013:33
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private AppConfig appConfig;

    @GetMapping(value = "/get-config")
    public ConfigBean getConfig() {
        return appConfig.getConfigBean();
    }
}