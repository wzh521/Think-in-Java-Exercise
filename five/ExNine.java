package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */

public class ExNine {
    public ExNine(String s){
        System.out.println("default constructor");
    }
    public ExNine(String s ,String s1){
        this("a");
        System.out.println("construtor ssss ");

    }
    private String  e ="s";
    public static void test(){

    }

    public static void main(String[] args) {
        ExNine exNine = new ExNine("s","a");

    }
}
