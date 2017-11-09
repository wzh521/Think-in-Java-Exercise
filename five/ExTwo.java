package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/8.
 */

/**
 * @author:Administrator
 * @date:2017/11/8
 * @description:
 */

public class ExTwo {
    String s ="hello";
    String s1;
    public ExTwo (String s1){
        this.s1=s1;
    }

    public static void main(String[] args) {
        ExTwo exTwo = new ExTwo("nihao");
        System.out.println(exTwo.s);
        System.out.println(exTwo.s1);

    }
}
