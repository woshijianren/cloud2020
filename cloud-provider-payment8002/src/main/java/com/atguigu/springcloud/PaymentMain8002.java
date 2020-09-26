package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zyl
 * @Date: 2020/9/6 17:35
 * @Describe
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {

    public static void main(String[] args) {
        try {
            SpringApplication.run(PaymentMain8002.class, args);

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
