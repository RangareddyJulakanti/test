package com.multithreading.pools;

/**
 * Created by RANGAREJ on 5/20/2018.
 */
public class MyUncaughtHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Exception is raised by {} "+t.getName()+e.getMessage());
    }
}
