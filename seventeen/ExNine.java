package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/15.
 */

import com.wzh.thik.in.java.sixteen.CollectionData;

import java.util.TreeSet;

/**
 * @author:Administrator
 * @date:2017/12/15
 * @description:
 */

public class ExNine {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
//        ts.addAll(CollectionData.list(
//                new RandomGenerator.String(), 10));
        System.out.println("ts = " + ts);

    }
}
