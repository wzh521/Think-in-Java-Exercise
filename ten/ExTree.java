package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
class Outer1{
    private  String s;
    public Outer1(String s){
        this.s=s;
    }
    class Inner1{
        Inner1(){
            System.out.println("Inner constructor");
        }
        @Override
        public String toString(){
            return s;
        }
    }
    public Inner1 getInner1(){
        return new Inner1();
    }
}
public class ExTree {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1("test www");
        Outer1.Inner1 inner1 = outer1.getInner1();
        System.out.println(inner1);
    }
}
