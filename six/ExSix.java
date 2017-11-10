package com.wzh.thik.in.java.six;/**
 * Created by Administrator on 2017/11/10.
 */

/**
 * @author:Administrator
 * @date:2017/11/10
 * @description:
 */
class WithProtect{
    protected  int i;
    public void print (){
        System.out.println(i);
    }
}

public class ExSix {
    public static void main(String[] args) {
        WithProtect wp = new WithProtect();
        wp.i =47 ;
        wp.print();
    }
}
