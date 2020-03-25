package com.lizs.springcloud.controller;

import com.lizs.springcloud.entities.CommonResult;
import com.lizs.springcloud.service.PaymentFeignService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {
    @Resource
    private PaymentFeignService paymentFeignService;;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Integer id) {
        return paymentFeignService.getPaymentById(id);
    }

}
