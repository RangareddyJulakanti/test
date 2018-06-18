package com.multithreading.pools.generics.bounded;

/**
 * Created by RANGAREJ on 6/16/2018.
 */
public class Test {
    public static void main(String[] args) {
        Data<Integer> integerData = new Data<>(10);
        System.out.println(integerData.getData());
        Data<Long> longData = new Data<>(10L);
        System.out.println(longData.getData());
         NestedData<String,Integer> nestedData = new NestedData<>("19");
         System.out.println(nestedData.getData("Integer"));
        NestedData<String,Long> longNestedData = new NestedData<>("25");
        System.out.println(longNestedData.getData("Long"));
    }
}

class Data<T extends Number> {
    private T t;

    public Data(T t) {
        this.t = t;
    }

    public T getData() {
        return t;
    }
}

class NestedData<T, P> {
    T t;

    public NestedData(T t) {
        this.t = t;
    }

    public P getData(String type) {
        switch(type){
            case "Integer":{
                return (P)Integer.valueOf((String)t);
            }
            case "Long":{
                return (P)Long.valueOf((String)t);
            }
        }
        return null;
    }
}
