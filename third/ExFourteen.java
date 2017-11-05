package com.wzh.thik.in.java.third;/**
 * Created by Administrator on 2017/11/5.
 */

/**
 * @author:Administrator
 * @date:2017/11/5
 * @description:
 */

public class ExFourteen {
    public static void p(String s, boolean b) {
        System.out.println(s + ": " + b);
    }
    public static void compare(String lval, String rval) {
        System.out.println("lval: " + lval + " rval: " + rval);
        p("lval == rval", lval == rval);
        p("lval != rval", lval != rval);
        p("lval.equals(rval)", lval.equals(rval));
    }
    public static void main(String[] args)
    {
        compare("Hello", "Hello");
        compare("Hello", "Goodbye");
    }
}
