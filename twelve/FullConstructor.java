package com.wzh.thik.in.java.twelve;

/**
 * Created by Administrator on 2017/10/25.
 */
public class FullConstructor {
    public static void f()throws MyException{
        System.out.println("this is f()");
        throw  new MyException();
    }
    public static void g()throws MyException{
        System.out.println("this is g()");
        throw new MyException ("hello");
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
        try{
            g();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}
class MyException extends Exception {
    public MyException(){}
    public MyException(String s){
        super(s);
    }

}
