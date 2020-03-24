package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;

import javax.annotation.Resource;

@RestController
public class DeptController {
    @Resource
    private DeptService service;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return service.list();
    }


}
