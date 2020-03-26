package com.atguigu.springcloud;

import com.atguigu.murule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

//自定义Ribbon负载均衡策略 注意：自定义的负载均衡策略配置类不能放在@ComponentScan注解扫描的当前包或子包下
//否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，也就是达不到自定义负载均衡策略的目的了
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)
@EnableEurekaClient//eureka的客户端
@SpringBootApplication
public class DeptConsumer80_App {
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}
