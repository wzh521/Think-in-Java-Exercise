package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */
class Base{
    public void f(){
        System.out.println("f()");
        g();
    }
    public void g(){
        System.out.println("g()");
    }

}
class Subclass extends Base{
    @Override
    public void g(){
        System.out.println("Subclass g()");
    }
}
public class ExTen {
    public static void main(String[] args) {
        Base base = new Subclass();
        base.f();
    }
}
