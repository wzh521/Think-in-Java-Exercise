package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class MyException1 extends  Exception{
    public MyException1(String s ){
        super(s);
    }
}
class Test{
    public void g()throws MyException1{
        throw  new MyException1("e");
    }
    public void f()throws  MyException{
       try{
           g();
       }catch (MyException1 e){
            throw new MyException("aaaa");
       }

    }
}
public class ExTen {
    public static void main(String[] args) {
        Test test = new Test();
        try{
            test.f();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
