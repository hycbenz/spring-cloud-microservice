package com.atguigu.murule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡策略.
 *
 * @className: MySelfRule
 * @author: 胡永持
 * @date: 2020-03-25 14:29
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule iRule() {
//        return new RandomRule();

        return new MyRandomRule();
    }

}