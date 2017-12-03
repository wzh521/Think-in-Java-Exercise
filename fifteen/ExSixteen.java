package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/30.
 */

/**
 * @author:Administrator
 * @date:2017/11/30
 * @description:
 */

public class ExSixteen {
    static SixTuple<String,String,Integer,Double,Boolean,String>f(){
        return Tuple.typle("a","b",1,1.1,true,"c");
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}
