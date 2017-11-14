package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

import com.wzh.thik.in.java.nine.test.InterfaceTest;

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */
class Test implements InterfaceTest{

    @Override
    public void f() {
        System.out.println("f");
    }

    @Override
    public void g() {
        System.out.println("g");
    }

    @Override
    public void h() {
        System.out.println("h");
    }
}
public class ExFive {
    public static void main(String[] args) {
        Test test = new Test();
        test.f();
        test.g();
        test.h();
    }
}
