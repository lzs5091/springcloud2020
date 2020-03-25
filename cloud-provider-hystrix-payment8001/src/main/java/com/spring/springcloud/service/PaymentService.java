package com.spring.springcloud.service;

import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String PaymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() +
                "paymentInfo_ok,id:" + id + "\t" + "^_^";
    }

    public String PaymentInfo_TimeOut(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() +
                "paymentInfo_TimeOut,id:" + id + "\t" + "^_^"+"耗时3秒";
    }
}
