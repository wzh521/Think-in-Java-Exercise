package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/22.
 */

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/**
 * @author:Administrator
 * @date:2017/11/22
 * @description:
 */

public class ExNine {
    static Set<Class<?>> alreadyDisplayed =
            new HashSet<Class<?>>();
    public static void printSuperClass(Class<?> c){
        Field[] fields = c.getDeclaredFields();
        if(fields.length != 0)
            System.out.println("Fields:"); for(Field fld : fields) {
            System.out.println("	" + fld);
        }
        for(Field fld : fields) {
            Class<?> k = fld.getType();
            if(!alreadyDisplayed.contains(k)) {
                printSuperClass(k);
                alreadyDisplayed.add(k);
            }
        }
        if (c==null) {return ; }
        System.out.println(c.getName());
        for(Class k :c.getInterfaces()){
            printSuperClass(k.getSuperclass());
        }
        printSuperClass(c.getSuperclass());
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("com.wzh.thik.in.java.fourteen.FancyToy");
        printSuperClass(c);
    }
}
