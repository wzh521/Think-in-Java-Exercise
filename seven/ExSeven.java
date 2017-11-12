package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */

class TestA1{
    public TestA1(int i){
        System.out.println(" TeseA constructor"+i);
    }

}
class TestB1{
    public TestB1(int i){
        System.out.println(" TestB constructor"+i);
    }
}
class TestC1 extends TestA1{
    TestB1 testB1 ;
    public TestC1(int i){
        super(i);
        testB1 =new TestB1(i);
    }
}
public class ExSeven {
    public static void main(String[] args) {
        new TestC1(5);
    }
}
