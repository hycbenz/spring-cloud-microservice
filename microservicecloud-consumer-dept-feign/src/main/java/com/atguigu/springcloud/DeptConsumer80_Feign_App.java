package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 这里是类说明.
 *
 * @className: DeptConsumer80_Feign_App
 * @author: 胡永持
 * @date: 2020-03-26 17:16
 */
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.atguigu.springcloud")
//@ComponentScan("com.atguigu.springcloud")
@SpringBootApplication
public class DeptConsumer80_Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}