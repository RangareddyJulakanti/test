package com.multithreading.pools;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by RANGAREJ on 5/19/2018.
 */
public class CompletableFutureDemo {
    public static void main(String a[]) throws InterruptedException, ExecutionException {
      // List<CompletableFuture<Integer>> result=new ArrayList<>();
      List<String> results=new ArrayList<>();
       for(int i=0;i<=10;i++) {
           MyCallable1 myCallable1=new MyCallable1(i);
          Integer result= CompletableFuture.supplyAsync(()->
                  {
                      Integer res=0;
                      try {
                          res=myCallable1.call();
                      } catch (InterruptedException e) {
                          e.printStackTrace();

                      }
                     return  res;
                  }
          ).get();
          System.out.println(result);

       }


    }
}

class MyCallable1 implements Callable {
    private int i;
    public MyCallable1(int i) {
        this.i = i;
    }
    public Integer call() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Executing task No : " + i + " Thread Name:" + Thread.currentThread().getName());
        return i;

    }
}

