package com.wzh.thik.in.java.four;/**
 * Created by Administrator on 2017/11/7.
 */

/**
 * @author:Administrator
 * @date:2017/11/7
 * @description:
 */

public class ExSix {
    public static boolean test(int testcal, int begin ,int end){
        if( begin<=testcal &&testcal <=end){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 15));
        System.out.println(test(5, 10, 15));
        System.out.println(test(5, 5, 5));
    }
}
