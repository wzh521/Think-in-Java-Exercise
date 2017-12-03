package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/2.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author:Administrator
 * @date:2017/12/2
 * @description:
 */
class ClassAsFactory<T>{
    Class<T> kind;
    public ClassAsFactory(Class<T> kind){
        this.kind =kind;
    }
    public T create(int arg){
        for(Constructor constructor : kind.getConstructors()){
            Class<?>[]params = constructor.getParameterTypes();
            if(params.length==1){
                if (params[0]==int.class){
                    try {
                        return kind.cast(constructor.newInstance(arg));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }
        return null;
    }
}
public class ExTwentyTwo {
    public static void main(String[] args) {
        ClassAsFactory<Integer> fi =
                new ClassAsFactory<Integer>(Integer.class);
        Integer i = fi.create(0);
        if(i==null){
            System.out.println("can not be instantiated!");
        }
    }
}
