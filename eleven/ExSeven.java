package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/17.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/11/17
 * @description:
 */
class IDClass {
    private static int counter; private int count = counter++; public String toString() {
        return "IDClass " + count;
    }
}
public class ExSeven {
    public static void main(String[] args) {
        IDClass[] idClass = new IDClass[10];
        for(int i=0; i<10; i++){
            idClass[i] = new IDClass();
        }
        List<IDClass>list = new ArrayList<>(Arrays.asList(idClass));
        System.out.println(list);
        List<IDClass> subSet =
                list.subList(list.size()/4, list.size()/2);
        System.out.println("subSet = " + subSet);
        subSet.clear(); System.out.println("lst = " + list);
    }
}
