package com.multithreading.pools;

/**
 * Created by RANGAREJ on 8/16/2018.
 */
public class PrintResultOneByOne {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            try {
                System.out.println("First thread taking 3 seconds for complete the task");
                Thread.sleep(3000);
                System.out.println("First Thread completed the task");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("First Thread completed");
        });
        Thread t2 = new Thread(()->{
            System.out.println("Second thread started");
           try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Second Thread completed");
        });
        Thread t3 = new Thread(()->{
           try {
               System.out.println("Third thread started");
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Third Thread completed");
        });
        t1.start();

        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Main Thread completed");
    }
}

class MyRunnable implements Runnable {
    final String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}