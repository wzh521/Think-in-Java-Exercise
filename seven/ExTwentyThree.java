package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class LoadTest{
    static {
        System.out.println("Loading LoadTest");
    }
    static void staticMember() {}
}
public class ExTwentyThree {
    public static void main(String[] args) {
        System.out.println("Calling static member");
        LoadTest.staticMember();
        System.out.println("Creating an object");
        new LoadTest();
    }
}
