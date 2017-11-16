package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */

public class ExThirteen {
    public static Interface getInterface(){
         return new Interface() {
             @Override
             public void f() {
                 System.out.println("Inner NiMing f()");
             }
         };

    }

    public static void main(String[] args) {
        Interface i = ExThirteen.getInterface();
        i.f();
    }


}
