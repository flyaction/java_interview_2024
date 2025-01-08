package com.flyaction.demo.test00;

import java.math.BigDecimal;

/**
 * @author: action
 * @create: 2025/1/7 09:07
 **/
public class demo2 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.10");
        BigDecimal b = new BigDecimal("0.1");
        System.out.println(a.compareTo(b));
    }
}
