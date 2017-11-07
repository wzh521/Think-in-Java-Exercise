package com.wzh.thik.in.java.four;/**
 * Created by Administrator on 2017/11/7.
 */

import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/11/7
 * @description:
 */

public class Extwo {
    static Random random = new Random(47);
    public static void testRandom(){
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        if( a == b ){
            System.out.println("a=b "+ a+" "+b);
        }
        if( a > b ){
            System.out.println("a>b "+ a+" "+b);
        }
        if( a < b ){
            System.out.println("a< b "+ a+" "+b);
        }

    }
    public static void main(String[] args) {
        for(int i = 0; i < 25;i++){
            testRandom();
        }
    }
}
