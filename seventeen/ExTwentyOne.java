package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/27.
 */

/**
 * @author:Administrator
 * @date:2017/12/27
 * @description:
 */

public class ExTwentyOne {
    public static void main(String[] args) {
        SimpleHashMap2<String,String> m =
                new SimpleHashMap2<String,String>();
        m.put("wzh1","nub");
        m.put("wzh","nb");
        m.put("wzh2","hnb");
        m.put("wzh1","nub");
        m.put("wzh1","nub");
        System.out.println(m);
    }
}
