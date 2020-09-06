package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: zyl
 * @Date: 2020/9/6 21:42
 * @Describe
 */
@SpringBootApplication
@EnableEurekaServer // 加上这个注解，表名自己就是Eureka的服务
public class EurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
