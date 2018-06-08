package com.multithreading.pools;

/**
 * Created by RANGAREJ on 5/20/2018.
 */
public class Test123 {
    public static void main(String a[]){
          Thread t=  new Thread(new MyRunnable2());
          t.setName("Ranga");
          t.setUncaughtExceptionHandler(new MyUncaughtHandler());
          t.start();

    }
}
class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        throw new ArithmeticException("devison/zero");
    }
}