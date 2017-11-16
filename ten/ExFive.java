package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
class Outer3 {
    class Inner {
        {
        System.out.println("Inner created");
    }
}
}
public class ExFive {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        Outer3.Inner inner  = outer3.new Inner();
    }
}
