package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/16.
 */

/**
 * @author:Administrator
 * @date:2017/11/16
 * @description:
 */

interface Interface2{
    class Inner5{
        public Inner5(){
            System.out.println("Inner5 constructor");
        }
    }
}
class TestStaticlass implements Interface2{
    public Inner5 getInner(){
        return new Inner5();
    }
}
public class Extwenty {
    public static void main(String[] args) {
        TestStaticlass testStaticlass = new TestStaticlass();
        testStaticlass.getInner();
    }
}
