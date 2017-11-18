package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/18.
 */

import java.util.LinkedList;

/**
 * @author:Administrator
 * @date:2017/11/18
 * @description:
 */
class Stack1<T>{
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v) {storage.addFirst(v);}
    public T peek(T v){ return  storage.getFirst();}
    public T pop(){ return storage.removeFirst();}
    public boolean empty(){return storage.isEmpty();}
    @Override
    public String toString(){ return storage.toString();}
}
public class ExFifteen {
    private final static Stack1<Character> stack = new Stack1<Character>();
    private static void evaluate(String expr) { char data[] = expr.toCharArray();
        for(int i = 0; i < data.length;) {
            switch (data[i++]) {
                case '+':
                    stack.push(data[i++]);
                    break;
                case '-':
                    System.out.print(stack.pop());
            }
        }
    }

    public static void main(String[] args) {
        evaluate(
                "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
    }
}
