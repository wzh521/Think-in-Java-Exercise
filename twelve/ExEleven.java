package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class Test1{
    public void g()throws MyException1{
        throw  new MyException1("e");
    }
    public void f()throws  MyException{
        try{
            g();
        }catch (MyException1 e){
            throw new RuntimeException(e);
        }

    }
}
public class ExEleven {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        try{
            test1.f();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
