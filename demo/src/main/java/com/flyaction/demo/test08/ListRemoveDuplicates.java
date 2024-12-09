package com.flyaction.demo.test08;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: action
 * @create: 2024/12/9 11:11
 **/
public class ListRemoveDuplicates
{
    /**
     * list去除重复元素你能想到几个方法，校招题
     * 有些面试官不让你用API，要求纯手写
     *
     * 如果你能找到更多更好方法，请给阳哥邮件:  zzyybs@126.com
     *
     * @param args
     */
    public static void main(String[] args)
    {
        //m1();
        //m2();
        //m3();
        //m4();
        //m5();
    }


    /**
     * 双for循环对比
     */
    private static void m5()
    {
        List<Integer> initList = Arrays.asList(70,70,-1,5,3,3,4,4,4,4,99);
        List<Integer> srcList = new ArrayList<>(initList);
        List<Integer> newList = new ArrayList<>(initList);

        for (int i = 0; i < newList.size()-1; i++) {
            System.out.println("外层循环第："+i+" "+newList);
            for (int j = newList.size()-1; j > i ; j--) {
                if(newList.get(j).equals(newList.get(i))){
                    newList.remove(j);
                }
                System.out.println("   内存循环第："+j+" "+newList);
            }
            System.out.println();
            System.out.println();
        }
        newList.forEach((s) -> System.out.print(s+" "));
        System.out.println();
        System.out.println();
    }

    /**
     * 循环坐标去除重复
     */
    private static void m4()
    {
        List<Integer> initList = Arrays.asList(70,70,-1,5,3,3,4,4,4,4,99);
        List<Integer> srcList = new ArrayList<>(initList);
        List<Integer> newList = new ArrayList<>(initList);

        System.out.println(srcList.indexOf(70));
        System.out.println(srcList.lastIndexOf(70));


        for (Integer element : srcList) {
            if(newList.indexOf(element) != newList.lastIndexOf(element)) {
                newList.remove(newList.lastIndexOf(element));
            }
        }
        newList.forEach((s) -> System.out.print(s+", "));
        System.out.println();
        System.out.println();
    }

    /**
     * Stream流式计算
     */
    private static void m3()
    {
        List<Integer> initList = Arrays.asList(70,70,-1,5,3,3,4,4,4,4,99);
        List<Integer> srcList = new ArrayList<>(initList);
        List<Integer> newList = null;

        newList = srcList.stream().distinct().collect(Collectors.toList());

        newList.forEach((s) -> System.out.print(s+", "));
    }

    /**
     * HashSet或者LinkedHashSet去重复
     */
    private static void m2()
    {
        List<Integer> srcList = Arrays.asList(70,70,-1,5,3,3,4,4,4,4,99);
        List<Integer> newList = new ArrayList<>(new HashSet<>(srcList));
        newList.forEach((s) -> System.out.print(s+" "));
        System.out.println();
        System.out.println();

        newList = new ArrayList<>(new LinkedHashSet<>(srcList));
        newList.forEach((s) -> System.out.print(s+" "));
        System.out.println();
        System.out.println();
    }

    /**
     * for循环遍历判断是否含有，没有就新增到newList里
     */
    private static void m1()
    {
        List<Integer> initList = Arrays.asList(70,70,-1,5,3,3,4,4,4,4,99);
        List<Integer> srcList = new ArrayList<>(initList);
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < srcList.size(); i++)
        {
            if(!newList.contains(srcList.get(i)))
            {
                newList.add(srcList.get(i));
            }
        }
        System.out.println(newList);
        System.out.println();
    }

}

