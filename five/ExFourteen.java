package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */

public class ExFourteen {
    static String string= "1";
    static String string1;
    static {
        string1="2";
    }
    public static void print(){
        System.out.println(string);
        System.out.println(string1);
    }

    public static void main(String[] args) {
        ExFourteen.print();
    }

}
