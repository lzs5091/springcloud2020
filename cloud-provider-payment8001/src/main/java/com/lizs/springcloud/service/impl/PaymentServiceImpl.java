package com.lizs.springcloud.service.impl;

import com.lizs.springcloud.dao.PaymentDao;
import com.lizs.springcloud.entities.Payment;
import com.lizs.springcloud.service.PaymentService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentdao;

    @Override
    public int create(Payment payment) {
        return paymentdao.create(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentdao.getPaymentById(id);
    }
}
