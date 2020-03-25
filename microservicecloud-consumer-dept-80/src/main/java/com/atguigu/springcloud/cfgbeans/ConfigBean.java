package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //开启Ribbon负载均衡 ribbon其实就是一个客户端的软负载均衡组件
    //他可以结合他所请求的客户端结合使用，和eureka结合只是其中的一个示例
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
