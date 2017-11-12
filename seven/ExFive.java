package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/11.
 */

/**
 * @author:Administrator
 * @date:2017/11/11
 * @description:
 */
class TestA{
    public TestA(){
        System.out.println(" TeseA constructor");
    }

}
class TestB{
    public TestB(){
        System.out.println(" TestB constructor");
    }
}
class TestC extends TestA{
    TestB testB = new TestB();
}
public class ExFive {
    public static void main(String[] args) {
        new TestC();
    }
}
