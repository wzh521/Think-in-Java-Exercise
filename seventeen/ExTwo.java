package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/12.
 */

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import static com.wzh.thik.in.java.seventeen.Countries.capitals;
import static com.wzh.thik.in.java.seventeen.Countries.names;

/**
 * @author:Administrator
 * @date:2017/12/12
 * @description:
 */

public class ExTwo {
    public static void main(String[] args) {
        TreeMap<String,String> map =
                new TreeMap<String,String>(capitals());
        TreeSet<String> set = new TreeSet<String>(names());
        String b = null;
        for(String s : map.keySet())
            if(s.startsWith("B")) {
            b = s; break;
        }
        Map<String,String> aMap = map.headMap(b);
        Set<String> aSet = set.headSet(b);
        System.out.println("aMap = " + aMap);
        System.out.println("aSet = " + aSet);

    }
}
