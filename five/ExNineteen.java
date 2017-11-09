package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */

public class ExNineteen {
    public static void test(String...strings){
        for (String s:strings){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        test("1","2","3");
        test(new String[]{"4","5","6"});
    }
}
