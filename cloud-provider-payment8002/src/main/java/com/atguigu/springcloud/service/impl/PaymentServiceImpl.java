package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao2;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: zyl
 * @Date: 2020/9/6 18:16
 * @Describe
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao2 paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create2(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById2(id);
    }
}
