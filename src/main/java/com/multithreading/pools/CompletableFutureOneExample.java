package com.multithreading.pools;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by RANGAREJ on 5/20/2018.
 */
public class CompletableFutureOneExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

      list.stream().map(data-> CompletableFuture.supplyAsync(()->getNumber(data)))
                   .map(compFuture->compFuture.thenApply(n->n*n))
                   .map(t->t.join())
                  .forEach(s->System.out.println(s));

      long start=System.currentTimeMillis();
        CompletableFuture<Integer> completableFuture1= CompletableFuture.supplyAsync(()->getNumber(10));

        completableFuture1.thenAccept(res->System.out.println("Computation is done"+res));

        CompletableFuture<Integer> completableFuture2= CompletableFuture.supplyAsync(()->getNumber(20));

        Integer result=completableFuture1.thenCombineAsync(completableFuture2,(s,f)->f+s).get();

        System.out.println(result);
        long end=System.currentTimeMillis();
        System.out.println("total time taken in millies"+(end-start));
     /* long start=System.currentTimeMillis();
      System.out.println(getNumber(10)+getNumber(20));
      long end=System.currentTimeMillis();
        System.out.println("total time taken in millies"+(end-start));*/
    }



    //private static Function<Integer, Integer> multiplySameNum = number -> number * number;

    private static int getNumber(int a) {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a * a;
    }
}
