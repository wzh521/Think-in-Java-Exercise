package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/2.
 */

/**
 * @author:Administrator
 * @date:2017/12/2
 * @description:
 */
class Generic1<T>{
    public  void f(T obj){}
}
class Generic2<T>{
    public T g(){
        return null;
    }
}
public class ExTwentyEight {
    static <T> void f1(Generic1<? super T> obj, T item) { obj.f(item);
    }
    static <T> T f2(Generic2<? extends T> obj) { return obj.g();
    }
}
