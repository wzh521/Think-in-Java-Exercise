package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class Component11{
    public Component11(int i){
        System.out.println("Component1 constructor"+i);
    }
}
class Component21{
    public Component21(int i){
        System.out.println("Component1 constructor"+i);
    }
}
class Component31{
    public Component31(int i){
        System.out.println("Component1 constructor" +i);
    }
}
class Root1{
    Component11 component1=new Component11(1);
    Component21 component2=new Component21(2);
    Component31 component3= new Component31(3);

    public Root1(int i){
        System.out.println("Root constructor"+i);

    }
}
class Stem1 extends Root1{
    Component11 component1=new Component11(4);
    Component21 component2=new Component21(5);
    Component31 component3= new Component31(6);
    public Stem1(int i){
        super(i);
        System.out.println("Stem constructor"+i);
    }

}

public class ExTen {
    public static void main(String[] args) {
        new Stem1(47);
    }
}
