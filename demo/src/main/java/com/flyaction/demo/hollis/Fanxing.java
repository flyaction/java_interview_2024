package com.flyaction.demo.hollis;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author: action
 * @create: 2025/2/27 10:24
 **/
public class Fanxing {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Method method = list.getClass().getMethod("add",Object.class);
        method.invoke(list,"java反射机制");
        System.out.println(list.get(0));

    }
}
