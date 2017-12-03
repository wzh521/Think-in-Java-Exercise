package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/2.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/12/2
 * @description:
 */
class Holder1<T>{
    private T value;
    public Holder1(){}
    public Holder1(T value){
        this.value=value;
    }
    public void set(T value){
        this.value=value;
    }
    public T get (){
        return value;
    }
    @Override
    public boolean equals(Object obj){
        return value.equals(obj);
    }
}
public class ExTwentyNine {
    static void f1(Holder1<List<?>> holder) { List<?> list = holder.get();
        System.out.println(holder.equals(list));
// Compile errors:
// list.add(1);
// list.add(new Object());
        Integer i = (Integer)list.get(0);
        System.out.println(i);
        System.out.println(list.contains(i));
        System.out.println(list.remove(i));
        holder.set(new ArrayList<Float>());
    }
    static void f2(List<Holder1<?>> list) {
        Holder1<?> holder = (Holder1<?>)list.get(0);
        System.out.println(holder.equals(Integer.valueOf(1)));
// Compile error:
// holder.set(new Integer(2));
// System.out.println(holder.get());
       // list.add(new Holder<Float>(1.0F)); S
        System.out.println(list.get(1).get()); list.remove(0); System.out.println(list.size());
    }
}
