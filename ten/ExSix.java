package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

import com.wzh.thik.in.java.ten.onepackage.SimpleInterface;
import com.wzh.thik.in.java.ten.twopackage.SimpleClass;

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
class SimpleClass1 extends SimpleClass{
    public SimpleInterface getInterface(){
        return new Inner();
    }
}
public class ExSix {
    public static void main(String[] args) {
      new SimpleClass1().getInterface().f();
    }
}
