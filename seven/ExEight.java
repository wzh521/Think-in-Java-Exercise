package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class Base1{
    public Base1(int i){
        System.out.println("Base1 constructor "+i);
    }
}
class Derived extends Base1{
    public Derived(){
        super(47);
    }
    public Derived(int i){
        super(i);
    }
}
public class ExEight {
    public static void main(String[] args) {
        new Derived();
        new Derived(41);
    }
}
