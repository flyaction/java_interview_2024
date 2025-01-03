package com.flyaction.demo.controller;

import com.flyaction.demo.entities.CustomerMixInfo;
import com.flyaction.demo.service.CustomerService;
import com.flyaction.demo.entities.CustomerMixInfo;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther zzyy
 * @create 2024-05-08 10:45
 */
@RestController
@Slf4j
public class CustomerController
{
    @Resource
    private CustomerService customerSerivce;

    @GetMapping(value = "/customer/findv1")
    public CustomerMixInfo findCustomer()
    {
        return customerSerivce.findCustomer();
    }

    @GetMapping(value = "/customer/findv2")
    public CustomerMixInfo findCustomerByCompletableFuture()
    {
        return customerSerivce.findCustomerByCompletableFuture();
    }
}
