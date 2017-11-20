package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String s) { super(s); }
}
public class ExTwentyEight {
    public static void main(String[] args) {
        throw  new MyRuntimeException("sss");
    }
}
