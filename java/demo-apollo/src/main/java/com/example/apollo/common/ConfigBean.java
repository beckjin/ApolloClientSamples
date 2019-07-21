/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.example.apollo.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Administrator
 * @date 2019/7/2014:01
 */
@Getter
@Setter
@ToString
public class ConfigBean {

    @Value("${name:name取不到时的默认值}")
    private String name;

    @Value("${company:name取不到时的默认值}")
    private String company;

    @Value("${url:url取不到时的默认值}")
    private String url;
}