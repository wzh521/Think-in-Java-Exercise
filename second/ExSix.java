package com.wzh.thik.in.java.second;/**
 * Created by Administrator on 2017/11/4.
 */

/**
 * @author:Administrator
 * @date:2017/11/4
 * @description:
 */

public class ExSix {
    String s ="Hello,World";
    int storage(String s){
        return s.length()*2;
    }
    void print(){
        System.out.println("storage(s)"+storage(s));
    }

    public static void main(String[] args) {
        ExSix exSix = new ExSix();
        exSix.print();
    }
}
