package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */

public class ExTen {
    public Interface getInterface(){
        {
             class Inner1 implements Interface{
                 public Inner1(){}
                 @Override
                 public void f() {
                     System.out.println("Inner f()");
                 }
             }
            return new Inner1();
        }

    }

    public static void main(String[] args) {
        Interface i = new ExTen().getInterface();
        i.f();
    }
}
