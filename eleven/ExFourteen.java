package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/18.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author:Administrator
 * @date:2017/11/18
 * @description:
 */

public class ExFourteen {
    public static void main(String[] args) {
        List<Integer> list  = new LinkedList<>();
        ListIterator<Integer> it = list.listIterator();
        for(int i=1; i<=10; i++){
            it.add(i);
            if(i%2 == 0){
                it.previous();
            }
        }
        System.out.println(list);
    }
}
