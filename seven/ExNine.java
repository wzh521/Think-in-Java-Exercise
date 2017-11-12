package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class Component1{
    public Component1(){
        System.out.println("Component1 constructor");
    }
    public void dispose(){
        System.out.println("Component1 dispose() ");
    }
}
class Component2{
    public Component2(){
        System.out.println("Component2 constructor");
    }
    public void dispose(){
        System.out.println("Component2 dispose()");
    }
}
class Component3{
    public Component3(){
        System.out.println("Component1 constructor");
    }
    public void dispose(){
        System.out.println("Component3 dispose()");
    }
}
class Root{
    Component1 component1=new Component1();
    Component2 component2=new Component2();
    Component3 component3= new Component3();

    public Root(){
        System.out.println("Root constructor");

    }
    public void dispose(){
        System.out.println("Root dispose()");
        component1.dispose();
        component2.dispose();
        component3.dispose();
    }
}
class Stem extends Root{
    Component1 component1=new Component1();
    Component2 component2=new Component2();
    Component3 component3= new Component3();
    public Stem(){
        System.out.println("Stem constructor");
    }
    @Override
    public void dispose(){
        System.out.println("Stem dispose()");
        component1.dispose();
        component2.dispose();
        component3.dispose();
        super.dispose();

    }

}
public class ExNine {
    public static void main(String[] args) {
        new Stem();
    }
}
