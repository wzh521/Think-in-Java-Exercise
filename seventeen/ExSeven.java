package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/12.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author:Administrator
 * @date:2017/12/12
 * @description:
 */

public class ExSeven {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Countries.names());
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        LinkedList<String> list1 =
                new LinkedList<String>( Countries.names(20).subList(10, 20));
        Iterator<String> it1 = list1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        int alindex = 0;
        for(ListIterator<String> lit2 = list1.listIterator(); lit2.hasNext();) {
            list.add(alindex, lit2.next());
            alindex += 2;
        }
        alindex = 0;
        for(ListIterator<String>
        lit2 = list.listIterator(list1.size());
            lit2.hasPrevious();) {
            list.add(alindex, lit2.previous());
            alindex += 2;
        }



    }
}
