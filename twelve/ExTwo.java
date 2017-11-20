package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
public class ExTwo {
    public static void main(String[] args) {
        String s= null;
        try {
            s.toString();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
