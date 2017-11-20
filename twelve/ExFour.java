package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class NewException extends Exception{
    String s;
    public NewException(){}
    public NewException(String msg){
        super(msg);
        s=msg;
    }
    public void f(){
        System.out.println(s);
    }
}
public class ExFour {
    public static void main(String[] args) {
        try {
            throw new NewException("this is new Exception");
        }catch (NewException e){
            e.f();
            System.out.println(e.getMessage());
        }
    }
}
