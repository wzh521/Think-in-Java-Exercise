package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/16.
 */

/**
 * @author:Administrator
 * @date:2017/11/16
 * @description:
 */
interface Interface3{
    class Inner6{
        public static void getF(Interface3 interface3){
            interface3.f();
        }
    }
    void f();
}
class TestInterface3 implements Interface3{
    @Override
    public void f() {
        System.out.println("TestInterface3 f()");
    }
}
public class ExTwentyOne {
    public static void main(String[] args) {
        TestInterface3 testInterface3 = new TestInterface3();
        Interface3.Inner6.getF(testInterface3);
    }
}
