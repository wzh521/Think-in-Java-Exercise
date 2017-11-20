package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/10/26.
 */

/**
 * @author:Administrator
 * @date:2017/10/26
 * @description:
 */

public class NeverCaught {
    static void f(){
        throw new RuntimeException("From f()");
    }
    static void g(){
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
