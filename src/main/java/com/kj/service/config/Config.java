package com.kj.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Configuration
public class Config {
    //可以返回一个字符串的时间
    @Bean
    public static  String simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    @Bean
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
