package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/18.
 */
import  java.util.*;
/**
 * @author:Administrator
 * @date:2017/12/18
 * @description:
 */

public class ExSixteen {
    public static void printKeys(Map<Integer,String> map) {
        System.out.println("Size = " + map.size() + ", "); 
        System.out.println("Keys: ");
        System.out.println(map.keySet()); // Produce a Set of the keys
    }
    public static void test(Map<Integer,String> map) {
        System.out.println(map.getClass().getSimpleName()); 
        map.putAll(new CountingMapData(25));
         map.putAll(new CountingMapData(25));
        printKeys(map);
         System.out.println("Values: ");
        System.out.println(map.values());
        System.out.println(map);
        System.out.println("map.containsKey(11): " + map.containsKey(11)); 
        System.out.println("map.get(11): " + map.get(11)); 
        System.out.println("map.containsValue(\"F0\"): "
                + map.containsValue("F0"));
        Integer key = map.keySet().iterator().next(); 
        System.out.println("First key in map: " + key); map.remove(key);


        printKeys(map); map.clear();
        System.out.println("map.isEmpty(): " + map.isEmpty()); map.putAll(new CountingMapData(25));
         map.keySet().removeAll(map.keySet()); 
        System.out.println("map.isEmpty(): " + map.isEmpty());
    }
    public static void main(String[] args) {
        System.out.println("Testing SlowMap");
        test(new SlowMap<Integer,String>());
        System.out.println("Testing SlowMap2");
        test(new SlowMap<Integer,String>());
    }

}
