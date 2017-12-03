package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/29.
 */

/**
 * @author:Administrator
 * @date:2017/11/29
 * @description:
 */
class Holder<T> {
    private T a,b,c;
    public Holder(T a,T b,T c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void setA(T a) { this.a = a; }
    public void setB(T b) { this.b = b; }
    public void setC(T c) { this.c = c; }
    public T getA() { return a; }
    public T getB() { return b; }
    public T getC() { return c; }
}
public class ExTwo {
    public static void main(String[] args) {
        Holder<String>holder=new Holder<>("A","B","C");
        System.out.println(holder.getA());
        System.out.println(holder.getB());
        System.out.println(holder.getC());
        holder.setC("d");
        System.out.println(holder.getC());
    }
}
