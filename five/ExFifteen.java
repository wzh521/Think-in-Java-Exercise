package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */

public class ExFifteen {
     String s;
    {
        s= "aaa";
    }
    public ExFifteen(){
        System.out.println(s);
    }
    public ExFifteen(int i){
        System.out.println(s);
    }

    public static void main(String[] args) {
        new ExFifteen();
        new ExFifteen(1);
    }
}
