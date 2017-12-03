package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/29.
 */

/**
 * @author:Administrator
 * @date:2017/11/29
 * @description:
 */
class Holder3<T>{
    private T a;
    public Holder3(T a){
        this.a=a;
    }
    public void set(T a){
        this.a=a;
    }
    public T get(){
        return a;
    }
}
class A{}
class B extends A{}
public class ExOne {
    public static void main(String[] args) {
        Holder3<A>holder3 = new Holder3<>(new B());
        System.out.println(holder3.get());
    }

}
