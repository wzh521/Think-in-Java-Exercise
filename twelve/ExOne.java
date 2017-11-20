package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */

public class ExOne {
    public static void main(String[] args) {
        try{
            throw new Exception("hello");
        }catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }finally {
            System.out.println("ssss");
        }
    }
}
