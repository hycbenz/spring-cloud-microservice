package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//Zuul包含了对请求的路由和过滤两个最主要的功能
//其中路由功能负责将外部请求转发到具体的微服务实例上，
// 是外部访问统一入口的基础，而过滤器的功能则负责对请求的处理过程进行干预，是实现请求校验，服务聚合等功能的基础。
//Zuul和Eureka进行整合，将Zuul自身注册为Eureka服务治理下的应用，同时从Eureka中获取其它微服务的消息，也即以后的访问微服务都是通过Zuul跳转后获得。
//注意：Zuul服务最终还是会注册进eureka
//提供：代理+路由+过滤 三大功能
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
    }
}
