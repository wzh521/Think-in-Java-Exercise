package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */
interface StaticFinalTest {
    String RED = "Red";
}

class Test1 implements StaticFinalTest {
    public Test1() {

	//RED = "Blue";
}
}


public class ExSeventeen {
    public static void main(String[] args) {
        System.out.println(StaticFinalTest.RED);
    }
}
