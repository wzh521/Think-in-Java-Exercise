package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/11.
 */

/**
 * @author:Administrator
 * @date:2017/11/11
 * @description:
 */
class Art{
   Art(){
       System.out.println(" Art constructor");
   }
}
class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor");
    }
}
class CartoonWithDefCtor extends Drawing{ }
public class ExThree {
    public static void main(String[] args) {
        CartoonWithDefCtor cartoonWithDefCtor = new CartoonWithDefCtor();
    }
}
