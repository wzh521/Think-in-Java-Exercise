package com.wzh.thik.in.java.second;/**
 * Created by Administrator on 2017/11/4.
 */

/**
 * @author:Administrator
 * @date:2017/11/4
 * @description:
 */
class StaticTest{
    static int i = 47;
}
public class ExSeven {
    static void increment(){
        StaticTest.i++;
    }

    public static void main(String[] args) {
//        ExSeven exSeven = new ExSeven();
//        exSeven.increment();
//        System.out.println(StaticTest.i);
        ExSeven.increment();
        System.out.println(StaticTest.i);
    }
}
