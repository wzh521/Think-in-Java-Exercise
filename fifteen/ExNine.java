package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/29.
 */

/**
 * @author:Administrator
 * @date:2017/11/29
 * @description:
 */
class GenericMethods{
    public <A,B,C>void f(A a,B b,C c){
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }
    public <A,B>void f1(A a,B b,Boolean c){
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }
}
public class ExNine {
    public static void main(String[] args) {
        GenericMethods genericMethods =new GenericMethods();
        genericMethods.f(1,1.1,1L);
    }
}
