package com.flyaction.demo.test00;

/**
 * @author: action
 * @create: 2024/12/30 09:35
 **/
public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                counter.increase();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                counter.increase();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}


class Counter{
    private int count = 0;
    synchronized public void increase(){
        count++;
    }

    public int getCount() {
        return count;
    }
}

