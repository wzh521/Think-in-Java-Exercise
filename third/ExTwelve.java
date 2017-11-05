package com.wzh.thik.in.java.third;/**
 * Created by Administrator on 2017/11/5.
 */

/**
 * @author:Administrator
 * @date:2017/11/5
 * @description:
 */

public class ExTwelve {
    public static void main(String[] args) {
        int i = -1 << 1;
        System.out.println(Integer.toBinaryString(i));
        while (i!=0){
            i>>>=1;
            System.out.println(Integer.toBinaryString(i));
        }
    }

}
