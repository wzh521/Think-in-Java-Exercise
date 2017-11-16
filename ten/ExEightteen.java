package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/16.
 */

/**
 * @author:Administrator
 * @date:2017/11/16
 * @description:
 */

class Outer7{
    static class Inner{
        public void f(){
            System.out.println("static Inner");
        }
    }
}
public class ExEightteen {
    public static void main(String[] args) {
        Outer7.Inner inner = new Outer7.Inner();
        inner.f();
    }
}
