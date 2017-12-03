package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/2.
 */

/**
 * @author:Administrator
 * @date:2017/12/2
 * @description:
 */
interface FactoryI<T>{
    T create(int arg);
}
class Foo2<T>{
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory){
        x=factory.create(1);
    }
}
class IntegerFactory implements FactoryI<Integer>{

    @Override
    public Integer create(int arg) {
        return new Integer(arg);
    }
}
class Widget {
    private final int id;
    Widget(int ident) { id = ident; }
    @Override
    public String toString() { return "Widget " + id; }
    public static class Factory implements FactoryI<Widget>{

        @Override
        public Widget create(int arg) {
            return new Widget(arg);
        }
    }
}
public class ExTwentyThree {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}
