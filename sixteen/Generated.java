package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import com.wzh.thik.in.java.eleven.Generator;

import java.lang.reflect.Array;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */

public class Generated {
    public static <T> T[] array(T[] a, Generator<T> gen){
        return new CollectionData<T>(gen,a.length).toArray(a);
    }
    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type,
                                Generator<T>gen,int size){
        T[] a= (T[])java.lang.reflect.Array.newInstance(type,size);
        return new CollectionData<T>(gen,size).toArray(a);
    }
}
