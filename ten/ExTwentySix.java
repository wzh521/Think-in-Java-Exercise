package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/16.
 */

/**
 * @author:Administrator
 * @date:2017/11/16
 * @description:
 */
class Outer9{
    class Inner7{

        Inner7(int i){
            System.out.println("Inner7 "+i);
        }
    }
}
class Outer10{
    class Inner8 extends Outer9.Inner7{
        Inner8( Outer9 outer9,int i){
            outer9.super(i);

        }
    }
}
public class ExTwentySix {
}
