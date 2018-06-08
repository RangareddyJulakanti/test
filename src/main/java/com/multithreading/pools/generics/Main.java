package com.multithreading.pools.generics;

import com.sun.javaws.CacheUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by RANGAREJ on 6/6/2018.
 */
public class Main {
    public static void main(String[] args) {
        Test<Integer> t1=new Test<>(10);
        Test<Double> t2=new Test<>(10.5);
        System.out.println(t1.getObject());
        System.out.println(t2.getObject());

        ArrayList<ArrayList> al3=new ArrayList<>();
        al3.add(new ArrayList());
        m2(al3);

    }

    public static void m2(ArrayList<? extends List> al){
        //al.add(null);
    //    al.add(new ArrayList());
        al.stream().forEach(t-> {
            System.out.println(t.add(10));
        });
    }
}
