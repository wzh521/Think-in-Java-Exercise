package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
interface Interface{
    void f();
}
public class ExNine {
    public Interface getInterface(){
         class Inner implements Interface{
             public Inner(){}
             @Override
             public void f() {
                 System.out.println(" Inner f() ");
             }
         }
        return new Inner();
    }

    public static void main(String[] args) {
        Interface i = new ExNine().getInterface();
        i.f();
    }
}
