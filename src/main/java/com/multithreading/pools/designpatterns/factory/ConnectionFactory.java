package com.multithreading.pools.designpatterns.factory;

/**
 * Created by RANGAREJ on 5/23/2018.
 */
public class ConnectionFactory {
    public static  Connection getConnection(String dataBaseType){
        if(dataBaseType.equalsIgnoreCase("O")){
            return new OracleConnection();
        } else if(dataBaseType.equalsIgnoreCase("P")){
            return new PostgressConnection();
        }
        else{
            return new MySqlConnection();
        }
    }
}
