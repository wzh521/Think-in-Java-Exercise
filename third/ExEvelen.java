package com.wzh.thik.in.java.third;/**
 * Created by Administrator on 2017/11/5.
 */

/**
 * @author:Administrator
 * @date:2017/11/5
 * @description:
 */

public class ExEvelen {
    public static void main(String[] args) {
        int i = 0x80000000;
        while (i!=-1){
            System.out.println(Integer.toBinaryString(i));
            i>>=1;
        }
        i>>=1;
        System.out.println(Integer.toBinaryString(i));

    }
}
