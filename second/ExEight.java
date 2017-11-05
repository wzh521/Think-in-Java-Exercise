package com.wzh.thik.in.java.second;/**
 * Created by Administrator on 2017/11/4.
 */

/**
 * @author:Administrator
 * @date:2017/11/4
 * @description:
 */

public class ExEight {
    static int i = 47;

    public static void main(String[] args) {
        ExEight exEight = new ExEight();
        ExEight exEight1 = new ExEight();
        System.out.println(exEight.i+"=="+exEight1.i);
        ExEight.i++;
        System.out.println(exEight.i+"=="+exEight1.i);

    }
}
