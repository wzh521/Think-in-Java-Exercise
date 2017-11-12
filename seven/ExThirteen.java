package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class BaseC{
    public void f(){
        System.out.println("f()");
    }
    public void f(int i){
        System.out.println("f()"+ i);
    }
    public void f(double d){
        System.out.println("f()"+d);
    }
}
class TestBase extends BaseC{
    public void f(String s){
        System.out.println("f()" +s);
    }
}
public class ExThirteen {
    public static void main(String[] args) {
        TestBase testBase = new TestBase();
        testBase.f();
        testBase.f(1);
        testBase.f(1.1);
        testBase.f("s");
    }
}
