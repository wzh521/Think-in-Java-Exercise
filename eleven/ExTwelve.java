package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/18.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author:Administrator
 * @date:2017/11/18
 * @description:
 */

public class ExTwelve {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<5; i++){
            list1.add(i);
        }
        ListIterator<Integer> it = list1.listIterator(list1.size());

        while(it.hasPrevious()){
            list2.add(it.previous());
        }
        System.out.println(list1);
        System.out.println(list2);

    }
}
