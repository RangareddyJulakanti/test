package com.multithreading.pools.generics;

/**
 * Created by RANGAREJ on 6/6/2018.
 */
public class Test<T extends Number>
{
    T obj;
    public Test(T obj){
        this.obj=obj;
    }
    public T getObject(){
        return obj;
    }
}
