package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class Thrower{
    public void f(){
       // throw  new NewException("f()");
    }
    public void g()throws NewException{
        throw new NewException("g()");
    }
}
public class ExEight {
    public static void main(String[] args) {
        Thrower thrower = new Thrower();
        try {
            thrower.g();
        }catch (NewException e ){
            System.out.println(e);
        }

    }
}
