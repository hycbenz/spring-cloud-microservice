package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 这里是类说明.
 *
 * @className: Dept
 * @author: 胡永持
 * @date: 2020-03-24 10:15
 */
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
@Data//get set方法
@Accessors(chain = true)    //开启链式编程
public class Dept implements Serializable {

    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}