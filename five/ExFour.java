package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */

public class ExFour {
    public ExFour(){
        System.out.println("default ");
    }
    public ExFour(String s){
        System.out.println("sssss"+s);
    }

    public static void main(String[] args) {
        ExFour exFour =new ExFour("ello");
        ExFour exFour1 = new ExFour();
    }
}
