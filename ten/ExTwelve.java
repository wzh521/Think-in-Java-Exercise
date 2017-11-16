package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
class Test2{
    private String s ="ssss";
    private void f(){
        System.out.println(s);
    }
    public void g(){
        new Object(){
            public void h(){
                s= s+ "1";
                f();
            }

        }.h();
    }
}
public class ExTwelve {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.g();
    }
}
