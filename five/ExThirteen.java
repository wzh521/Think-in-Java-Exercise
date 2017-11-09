package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */
class Cup{
    public Cup(int mark) {
        System.out.println("Cup "+mark);
    }
    void f(int mark){
        System.out.println("f "+mark);
    }
}
class Cups{
    static Cup cup1;
    static Cup cup2;
    static{
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups");
    }
}

public class ExThirteen {
    public static void main(String[] args) {
        System.out.println("inside main");
     //   Cups.cup1.f(99);
    }
    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}
