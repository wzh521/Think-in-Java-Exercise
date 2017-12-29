package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/18.
 */
import  java.util.*;
/**
 * @author:Administrator
 * @date:2017/12/18
 * @description:
 */

public class ExTwelve {
    private static void test(Map<String, String> map) { map.put("sky", "blue");
        map.put("grass", "green");
        map.put("ocean", "dancing");
        map.put("tree", "tall");
        map.put("earth", "brown");
        map.put("sun", "warm"); try {
            map.put("extra", "object");
        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Too many objects!");
        }
        System.out.println(map);
        System.out.println(map.get("ocean"));
    }
    public static void main(String[] args) {
        test(new HashMap<String, String>());
        test(new TreeMap<String, String>());


        test(new LinkedHashMap<String, String>());
    }

}
