package com.flyaction.demo.test05;

import java.util.HashSet;

/**
 * @author: action
 * @create: 2024/12/5 17:26
 **/
public class HashConflictDemo
{
    static class Person
    {
        int id;
    }

    public static void main(String[] args)
    {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 1; i <=10 * 10000; i++) {
            int personHashCode = new Person().hashCode();
            if(!hashSet.contains(personHashCode))
            {
                hashSet.add(personHashCode);
            }else{
                System.out.println("发生了hash冲突,在第"+i+"次，值是："+personHashCode);
            }
        }
        System.out.println(hashSet.size());

    }

    private static void m1()
    {
        System.out.println("AA".hashCode());
        System.out.println("BB".hashCode());
        System.out.println();
        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());
        System.out.println();
        System.out.println("柳柴".hashCode());
        System.out.println("柴柕".hashCode());
    }
}
