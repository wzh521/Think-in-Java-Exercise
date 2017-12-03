package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/30.
 */
import  java.util.*;
/**
 * @author:Administrator
 * @date:2017/11/30
 * @description:
 */
class Sets{
    @SuppressWarnings("unchecked")
    protected static <T> Set<T> copy(Set<T> s){
        if(s instanceof  EnumSet){
            return ((EnumSet)s).clone();
        }
        return new HashSet<T>(s);
    }
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> result = copy(a);
        result.containsAll(b);
        return result;
    }
    public static <T> Set<T> intersection(Set<T> a, Set<T> b){
        Set<T> result =copy(a);
        result.retainAll(b);
        return result;
    }
    public static <T> Set<T> difference(Set<T> a,Set<T> b){
        Set<T> result =copy(a);
        result.removeAll(b);
        return result;
    }
    public static <T> Set<T> complement(Set<T> a,Set<T> b){
        return difference(union(a,b),intersection(a,b));
    }
}
public class ExSeventeen {
}
