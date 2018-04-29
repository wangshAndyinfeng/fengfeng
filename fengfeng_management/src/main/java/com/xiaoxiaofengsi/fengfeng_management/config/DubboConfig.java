package com.xiaoxiaofengsi.fengfeng_management.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dubbo1.properties")
@ImportResource({ "classpath:dubbo1/*.xml" })
public class DubboConfig {

}