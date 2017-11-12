package com.wzh.thik.in.java.seven;

/**
 * Created by Administrator on 2017/10/19.
 */
public class Exercise8 {
    public static void main(String[] args) {
        new B1();
        new B1(1);

    }
}
class A1 {
    A1(int i){
        System.out.println("A1"+i);

    }

}
class B1 extends A1{
    B1(){
        super(47);
    }
    B1(int i){
        super(i);
    }
}