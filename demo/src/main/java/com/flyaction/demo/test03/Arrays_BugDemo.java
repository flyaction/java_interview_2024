package com.flyaction.demo.test03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: action
 * @create: 2024/12/5 11:00
 **/
public class Arrays_BugDemo
{
    public static void main(String[] args) {
        //这样定义后再add会出现UnsupportedOperationException异常
        //List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.add(6);
        list.forEach(System.out::println);

    }
}
