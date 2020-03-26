package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 这里是类说明.
 *
 * @className: DeptProvider8001_Hystrix_App
 * @author: 胡永持
 * @date: 2020-03-24 10:55
 */
//@EnableDiscoveryClient  //服务发现 注册中心不是eureka时推荐使用
@EnableEurekaClient //表示是eureka的client 注册中心是eureka时推荐使用
@EnableHystrix  //开启Hystrix熔断机制
@SpringBootApplication
public class DeptProvider8001_Hystrix_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
    }
}