package com.multithreading.pools.designpatterns.factory;

/**
 * Created by RANGAREJ on 5/23/2018.
 */
public class OracleConnection implements Connection {
    @Override
    public String connectionName() {
        return "Oracle";
    }
}
