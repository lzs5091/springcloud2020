package com.lizs.springcloud.controller;

import com.lizs.springcloud.entities.CommonResult;
import com.lizs.springcloud.entities.Payment;
import com.lizs.springcloud.service.PaymentService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String port;
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("***********插入结果"+result);
        if(result>0){
            return new CommonResult(200,"插入成功,端口号："+port,result);
        }else {
            return new CommonResult(500,"插入失败,端口号："+port);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Integer id){
        Payment result = paymentService.getPaymentById(id);
        log.info("***********查询结果"+result);
        if(result!=null){
            return new CommonResult(200,"查询成功,端口号："+port,result);
        }else {
            return new CommonResult(500,"查询失败,端口号："+port);
        }
    }

}













