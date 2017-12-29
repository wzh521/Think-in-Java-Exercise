package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/12.
 */

import java.util.LinkedHashSet;
import java.util.Set;

import static com.wzh.thik.in.java.seventeen.Countries.names;

/**
 * @author:Administrator
 * @date:2017/12/12
 * @description:
 */

public class ExThree {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        for(int i = 0; i < 5; i++)
            set.addAll(names(10));
        System.out.println(set);

    }
}
