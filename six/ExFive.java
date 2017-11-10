package com.wzh.thik.in.java.six;/**
 * Created by Administrator on 2017/11/10.
 */

/**
 * @author:Administrator
 * @date:2017/11/10
 * @description:
 */

public class ExFive {
    public int a;
    private int b; protected int c;
    int d; // Package access
    public void f1() {}
    private void f2() {}
    protected void f3() {}
    void f4() {} // Package access

    public static void main(String[] args) {
        ExFive test = new ExFive();
        test.a = 1;
        test.b = 2;
        test.c = 3;
        test.d = 4; test.f1();
        test.f2();
        test.f3();
        test.f4();
    }
}
