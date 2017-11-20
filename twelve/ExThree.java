package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */

public class ExThree {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(a[i]);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
