package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/17.
 */

import java.util.Collection;
import java.util.HashSet;

/**
 * @author:Administrator
 * @date:2017/11/17
 * @description:
 */

public class ExTwo {
    public static void main(String[] args) {
        Collection<Integer> collection = new HashSet<>();
        for(int i=0; i<10; i++){
            collection.add(i);
        }
        for(int i:collection){
            System.out.println("i "+i);
        }
    }
}
