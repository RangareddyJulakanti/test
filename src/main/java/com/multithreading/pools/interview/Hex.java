package com.multithreading.pools.interview;

/**
 * Created by RANGAREJ on 5/31/2018.
 */
public class Hex {
    public static void main(String[] args) {
        Tests t=new Tests();
        t.clone();
    }
}
class Tests implements Cloneable{
    public Tests clone(){
        return this;
    }

}