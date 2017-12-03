package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/29.
 */

import java.util.HashMap;
import java.util.*;


/**
 * @author:Administrator
 * @date:2017/11/29
 * @description:
 */
class New{
    public static <K,V>Map<K,V>map(){
        return new HashMap<K, V>();
    }
    public static <T> List<T>list(){
        return new ArrayList<T>();
    }
    public static  <T> LinkedList<T> lList(){
        return new LinkedList<T>();
    }
    public static <T> Set<T> set(){
        return new HashSet<T>();
    }
    public static <T> Queue<T> queue(){
        return new LinkedList<T>();
    }
}
public class ExEleven {
    public static void main(String[] args) {
        List<SixTuple<Byte,Short,String,Float,Double,Integer>>
                list = New.list();
        list.add(
                new SixTuple<Byte,Short,String,Float,Double,Integer>(
                        (byte)1, (short)1, "A", 1.0F, 1.0, 1));
        System.out.println(list);
        Set<Sequence<String>> set = New.set();
        set.add(new Sequence<String>(5)); System.out.println(set);
    }
}
