package com.flyaction.demo.aopreview;

import com.flyaction.demo.aopreview.proxy.PayProxy;

/**
 * @auther zzyy
 * @create 2024-05-16 18:04
 */
public class ClientTest
{
    private static void payNormalV1()
    {
        PayService payService = new PayServiceImpl();
        payService.pay();
    }

    private static void payProxyV2()
    {
        PayService payService = new PayProxy(new PayServiceImpl());
        payService.pay();
    }

    public static void main(String[] args)
    {
        //payNormalV1();
        payProxyV2();
    }
}
