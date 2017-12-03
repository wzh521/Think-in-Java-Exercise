package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/3.
 */

/**
 * @author:Administrator
 * @date:2017/12/3
 * @description:
 */
class FixedSizeStack<T>{
    private int index=0;
    private Object[] storage;
    public FixedSizeStack(int size){
        storage=new Object[size];
    }
    public void push(T item){
        storage[index++]=item;
    }
    @SuppressWarnings("unchecked")
    public T pop(){
        return (T)storage[--index];
    }
}
class GenericCast{
    public static final int SIZE=10;

    public static void main(String[] args) {
        FixedSizeStack<String> strings=new FixedSizeStack<>(1);
        System.out.println(strings.pop());
        try{
            strings.pop();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        strings=new FixedSizeStack<>(1);
        strings.push("2");
        try{
            strings.push("2");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }
}
public class ExThirtyTwo {
}
