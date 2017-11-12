package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/11.
 */

/**
 * @author:Administrator
 * @date:2017/11/11
 * @description:
 */
class Base{
    Base(){
        System.out.println(" Base constructor");
    }
}
class Derived1 extends Base{
    Derived1(){
        System.out.println(" Derived1 constructor");
    }
}
class Derived2 extends Derived1{
    Derived2(){
        System.out.println("Derived2 constructor");
    }
}
public class ExFour {
    public static void main(String[] args) {
        new Derived2();
    }
}
