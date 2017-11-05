package com.wzh.thik.in.java.third;/**
 * Created by Administrator on 2017/11/5.
 */

/**
 * @author:Administrator
 * @date:2017/11/5
 * @description:
 */

public class ExTen {
    public static void main(String[] args) {
        int i1 = 0xaaaaaaaa; int i2 = 0x55555555;
        System.out.println("i1 = " + Integer.toBinaryString(i1));
        System.out.println("i2 = " + Integer.toBinaryString(i2));
        System.out.println("~i1 = " + Integer.toBinaryString(~i1));
        System.out.println("~i2 = " + Integer.toBinaryString(~i2));
        System.out.println("i1 & i1 = " + Integer.toBinaryString(i1 & i1));
        System.out.println("i1 | i1 = " + Integer.toBinaryString(i1 | i1));
        System.out.println("i1 ^ i1 = " + Integer.toBinaryString(i1 ^ i1)); 
        System.out.println("i1 & i2 = " + Integer.toBinaryString(i1 & i2)); 
        System.out.println("i1 | i2 = " + Integer.toBinaryString(i1 | i2));
        System.out.println("i1 ^ i2 = " + Integer.toBinaryString(i1 ^ i2));
    }
}
