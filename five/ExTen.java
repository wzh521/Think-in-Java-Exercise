package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */

public class ExTen {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("ssss");
    //    super.finalize();
    }

    public static void main(String[] args) {
        new ExTen();
    }
}
