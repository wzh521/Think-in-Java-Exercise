package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */

public class ExEleven {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize sss");
        //super.finalize();
    }

    public static void main(String[] args) {
        new ExEleven();
        System.gc();
        System.runFinalization();
    }
}
