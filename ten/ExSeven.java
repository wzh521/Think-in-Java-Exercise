package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
class Outer4{
    private  String s = "test";
    private void f(){
        System.out.println("Outer4 f() "+s);
    }
    class Inner{
        public void setS(){
            s="wzh";
            f();
        }

    }
    public void g(){
        Inner inner = new Inner();
        inner.setS();
    }
}
public class ExSeven {
    public static void main(String[] args) {
        Outer4 outer4 = new Outer4();

        outer4.g();
    }
}
