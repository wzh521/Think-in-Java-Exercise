package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/18.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Administrator
 * @date:2017/12/18
 * @description:
 */

public class Maps {
    public static void printKeys(Map<Object,Object> map){
        System.out.print("Size = "+map.size()+", ");
        System.out.print("Keys: ");
        System.out.print(map.keySet());
    }
    public static void test(Map<Object,Object> map){
        System.out.print(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        map.putAll(new CountingMapData(25));
        printKeys(map);

    }

    public static void main(String[] args) {
        test(new HashMap<>());
    }
}
