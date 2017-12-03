package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/2.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Administrator
 * @date:2017/12/2
 * @description:
 */
class Building{}
class House extends Building{}
class ClassTypeCapture<T>{
    Map<String,Class<?>> map = new HashMap<>();

    Class<T> kind;
    public ClassTypeCapture(){}
    public ClassTypeCapture(Class<T> kind){
        this.kind=kind;
    }
    public boolean f(Object arg){
        return kind.isInstance(arg);
    }
    public Object createNew(String name){
        Class<?>c =map.get(name);
        try{
            return c.newInstance();

        }catch (NullPointerException e){
            System.out.println("no find");
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return null;
    }
    public void addType(String typename,Class<?>kind){
        map.put(typename,kind);
    }
}
public class ExTwentyOne {
    public static void main(String[] args) {
        ClassTypeCapture ctt = new ClassTypeCapture();
        ctt.addType("Building", Building.class);
        ctt.addType("House", House.class);
        ctt.addType("Product", Product.class);
        System.out.println(ctt.createNew("Building").getClass());
        System.out.println(ctt.createNew("House").getClass());
        ctt.createNew("Product");
        ctt.createNew("Car");

    }
}
