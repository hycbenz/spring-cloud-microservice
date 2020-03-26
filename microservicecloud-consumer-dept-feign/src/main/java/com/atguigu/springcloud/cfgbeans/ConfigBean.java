package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//Ribbon的核心组件：IRule，可以根据特定的算法从服务列表中选择一个要访问的服务
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //开启Ribbon负载均衡 ribbon其实就是一个客户端的软负载均衡组件
    //他可以结合他所请求的客户端结合使用，和eureka结合只是其中的一个示例
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule iRule() {
        //使用轮询的负载均衡算法(Ribbon的默认策略)
//        return new RoundRobinRule();

        //使用随机的负载均衡算法
        return new RandomRule();

//        先按照RoundRobinRule的策略获取服务，如果获取服务则在指定时间内会进行重试，重新获取可用的服务
//        return new RetryRule();

//        会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务
//        return new BestAvailableRule();


    }
}
