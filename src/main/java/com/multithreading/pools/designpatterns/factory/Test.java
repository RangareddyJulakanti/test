package com.multithreading.pools.designpatterns.factory;

import java.util.*;

/**
 * Created by RANGAREJ on 5/23/2018.
 */
public class Test {
    public static void main(String a[]){
        Connection connection=ConnectionFactory.getConnection("R");
        System.out.println(connection.connectionName());
    }
}
