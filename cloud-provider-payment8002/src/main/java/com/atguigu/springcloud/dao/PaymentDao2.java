package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: zyl
 * @Date: 2020/9/6 17:58
 * @Describe
 */
@Mapper
public interface PaymentDao2 {

    int create2(Payment payment);

    Payment getPaymentById2(@Param("id") Long id);
}
