package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/30.
 */

import com.wzh.leetcode.Three;

/**
 * @author:Administrator
 * @date:2017/11/30
 * @description:
 */
class Tuple{
    public static <A,B> TwoTuple<A,B> typle(A a, B b){
        return new TwoTuple<>(a,b);
    }
    public static <A,B,C> ThreeTuple<A,B,C> typle(A a, B b ,C c){
        return new ThreeTuple<>(a,b,c);
    }
    public static <A,B,C,D> FourTuple<A,B,C,D> typle(A a, B b,C c,D d){
        return new FourTuple<>(a,b,c,d);
    }
    public static <A,B,C,D,E> FiveTuple<A,B,C,D,E> typle(A a, B b,C c,D d,E e){
        return new FiveTuple<>(a,b,c,d,e);
    }
    public static <A,B,C,D,E,F> SixTuple<A,B,C,D,E,F> typle(A a, B b,C c,D d,E e,F f){
        return new SixTuple<>(a,b,c,d,e,f);
    }
}
public class ExFifteen {
    static TwoTuple<String,Integer>f(){
        return Tuple.typle("hi",47);
    }
    static TwoTuple f2(){
        return Tuple.typle("hi",47);
    }
    static ThreeTuple<String,Integer,Double> g(){
        return Tuple.typle("a",1,1.1);
    }
    static FourTuple<String,String,Integer,Double>h(){
        return Tuple.typle("a","b",2,2.2);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
       // TwoTuple<String,Integer> ttsi1 = f2();
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());

    }
}
