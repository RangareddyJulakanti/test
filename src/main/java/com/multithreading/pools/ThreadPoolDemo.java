package com.multithreading.pools;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by RANGAREJ on 5/16/2018.
 */
public class ThreadPoolDemo {
    public static void main(String a[]) throws InterruptedException, ExecutionException {

        ExecutorService ex = Executors.newFixedThreadPool(5);
        System.out.println();

        List<Future<Integer>> result = new ArrayList();
        for (int i = 1; i <= 15; i++) {

            Future<Integer> taskNumber = ex.submit(new MyCallable(i));
            //System.out.println(taskNumber.get());
            result.add(taskNumber);
        }
        for (Future<Integer> value : result) {
            System.out.println(value.get());
        }
        ex.isShutdown();
        ex.shutdownNow();

    }
}

class MyCallable implements Callable {
    private int i;

    public MyCallable(int i) {
        this.i = i;
    }

    public Integer call() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Executing task No : " + i + " Thread Name:" + Thread.currentThread().getName());
        return i;

    }
}