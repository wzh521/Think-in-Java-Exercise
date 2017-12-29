package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/12.
 */

import java.util.*;

/**
 * @author:Administrator
 * @date:2017/12/12
 * @description:
 */

public class ExOne {
    private static Random random = new Random(47);

    public static void main(String[] args) {

        List<String> l = new ArrayList<>( Countries.names(8));
        Collections.sort(l);
        System.out.println("sort "+l);
        for(int i = 0; i < 5; i++){
            Collections.shuffle(l, random);
            System.out.println("shuffled (" + i + "): " + l);
        }
    }
}
