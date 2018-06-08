package com.multithreading.pools.designpatterns.factory;

/**
 * Created by RANGAREJ on 5/23/2018.
 */
public class MySqlConnection implements Connection {
    @Override
    public String connectionName() {
        return "MySql Connection";
    }
}
