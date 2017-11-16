package com.wzh.thik.in.java.ten.twopackage;/**
 * Created by Administrator on 2017/11/15.
 */

import com.wzh.thik.in.java.ten.onepackage.SimpleInterface;

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */

public class SimpleClass {
    protected  class Inner implements SimpleInterface {
       public Inner() {}
        @Override
        public void f() {
            System.out.println("Inner f()");
        }
    }
}
