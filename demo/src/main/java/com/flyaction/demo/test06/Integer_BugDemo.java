package com.flyaction.demo.test06;

/**
 * @author: action
 * @create: 2024/12/6 09:42
 **/
public class Integer_BugDemo
{
    public static void main(String[] args)
    {
        //new Integer(600); 构造方法可行？

        Integer a = Integer.valueOf(600);
        Integer b = Integer.valueOf(600);
        int c = 600;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);

        System.out.println("===================");

        Integer x = Integer.valueOf(99);
        Integer y = Integer.valueOf(99);
        System.out.println(x == y);
        System.out.println(x.equals(y));

    }
}
