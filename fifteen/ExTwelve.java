package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/29.
 */
import java.util.*;
/**
 * @author:Administrator
 * @date:2017/11/29
 * @description:
 */

public class ExTwelve {
    static void f(List<
            SixTuple<Byte,Short,String,Float,Double,Integer>> l) {
        l.add(
            new SixTuple<Byte,Short,String,Float,Double,Integer>(
                    (byte)1, (short)1, "A", 1.0F, 1.0, 1));
        System.out.println(l);
    }
    static void g(Set<Sequence<String>> s) {
        s.add(new Sequence<String>(5));
        System.out.println(s);
    }

    public static void main(String[] args) {
        f(New.<SixTuple<Byte,Short,String,Float,Double,Integer>>
                list());
        g(New.<Sequence<String>>set());
    }

}
