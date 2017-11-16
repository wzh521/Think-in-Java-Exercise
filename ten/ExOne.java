package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
class Outer{
    class Inner{
        Inner(){
            System.out.println("Inner constructor");
        }
    }
    public Inner getInner(){
        return new Inner();
    }
}
public class ExOne {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner= outer.getInner();
    }
}
