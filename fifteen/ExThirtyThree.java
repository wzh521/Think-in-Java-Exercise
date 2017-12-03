package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/3.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/12/3
 * @description:
 */
class FixedSizeStack2<T>{
    private int index;
    private final int size;
    private final List<T> list;
    public FixedSizeStack2(int size){
        this.size=size;
        list=new ArrayList<T>(size);
    }
    public void push(T item){
        if (index < size){
            index ++;
            list.add(item);
        }else {
            throw new RuntimeException();
        }
    }
    public T pop(){
        if(index > 0){
            return list.get(--index);
        }else {
            throw new RuntimeException();
        }
    }
}
public class ExThirtyThree {
    public static final int SIZE = 10;
    public static void main(String[] args) { FixedSizeStack2<String> strings =
            new FixedSizeStack2<String>(SIZE);
        for(String s : "A B C D E F G H I J".split(" ")) strings.push(s);
        for(int i = 0; i < SIZE; i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }
        System.out.println();
        try {
            strings.pop();
        } catch(Exception e) {
            System.out.println("Stack is empty");
        }
        strings = new FixedSizeStack2<String>(1); strings.push("A");


        try {
            strings.push("B");
        } catch(Exception e) {
            System.out.println("Stack is full");
        }
    }
}
