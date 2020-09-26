package com.atguigu.springcloud.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zyl
 * @date 2020/9/26 21:26
 * @describe 描述
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule ribbon() {
        return new RandomRule();
    }
}
