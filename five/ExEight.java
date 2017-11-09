package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */

public class ExEight {
    public  void test(){
        System.out.println("hello this is test");
    }
    public void test1 (){
        test();
        this.test();

    }


    public static void main(String[] args) {
        ExEight exEight = new ExEight();
        exEight.test1();
    }
}
