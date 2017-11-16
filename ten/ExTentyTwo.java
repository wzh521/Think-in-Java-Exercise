package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/16.
 */

/**
 * @author:Administrator
 * @date:2017/11/16
 * @description:
 */

public class ExTentyTwo {
    public static void main(String[] args) {
        Sequence sequence =new Sequence(10);
        for(int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.reverseSelector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }

}
