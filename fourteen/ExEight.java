package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/22.
 */

/**
 * @author:Administrator
 * @date:2017/11/22
 * @description:
 */

public class ExEight {
    public static void printSuperClass(Class<?> c){
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
