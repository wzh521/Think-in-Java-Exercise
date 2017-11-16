package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
class Base{
    private int i;
    public Base(int i){
        this.i = i;
    }
    public void f() { System.out.println("NoDefault.f"); }

}
class Second{

    public Base getBase(){
        return new Base(1){};
    }
    public Base getBase2(int i){
        return new Base(i){
            @Override
            public void f(){
                System.out.println("Base2");
            }
        };
    }
}
public class ExFifteen {

    public static void main(String[] args) {
        Second sec = new Second();
        Base base = sec.getBase();
        Base base1 =sec.getBase2(5);
        base1.f();

    }
}
