package com.multithreading.pools.reflection;

import sun.reflect.misc.ReflectUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by RANGAREJ on 5/23/2018.
 */
public class Test {
    public static void main(String arg[]) throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Student s3 = null;
        //Here dynamically loading Student class using Class.forName()
        Class studentClass = Class.forName("com.multithreading.pools.reflection.Student");
        Constructor[] constructors = studentClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {

            if (!constructor.isVarArgs()) {
                //here making student class constructor private to public
                constructor.setAccessible(true);
                //create new Instance of Student after making private constructor to public using Constructor cla?ss
                s3 = (Student) constructor.newInstance();
                System.out.println(s3);
            }
        }
      Object[] a=new Object[5];
        a[0]="Hai";
        System.out.println(System.identityHashCode(a[0]));

    }
}
