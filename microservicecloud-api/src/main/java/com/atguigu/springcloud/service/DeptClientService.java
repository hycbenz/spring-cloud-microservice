package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 这里是类说明.
 *
 * @className: DeptClientService
 * @author: 胡永持
 * @date: 2020-03-26 17:22
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")    //
public interface DeptClientService {

    @PostMapping("/dept/add")
    boolean add(Dept dept);

    @GetMapping("/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    List<Dept> list();
}