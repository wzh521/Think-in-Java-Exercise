package com.wzh.thik.in.java.seven;

/**
 * Created by Administrator on 2017/10/19.
 */
public class Exercise7 {


    public static void main(String[] args) {
      C c= new C(1);
    }
}
class A {
    A(int i){
        System.out.println("A"+i);
    }
}
class B{
    B(int i){
        System.out.println("B"+i);
    }
}
class C extends A{
    B b;
    C(int i){super(i);
        System.out.println("c"+i);
        b=new B(2);


    }
}