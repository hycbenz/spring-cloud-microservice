package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 这里是类说明.
 *
 * @className: EurekaServer7001_App
 * @author: 胡永持
 * @date: 2020-03-24 15:32
 */
@EnableEurekaServer//表示是eureka的server 会接受其它微服务注册进来
@SpringBootApplication
public class EurekaServer7001_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class, args);
    }
}