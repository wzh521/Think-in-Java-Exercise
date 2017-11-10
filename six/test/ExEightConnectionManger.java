package com.wzh.thik.in.java.six.test;/**
 * Created by Administrator on 2017/11/10.
 */

/**
 * @author:Administrator
 * @date:2017/11/10
 * @description:
 */

public class ExEightConnectionManger {
    private static ExEightConnectin[] pool = new ExEightConnectin[10];
    private static int counter = 0;
    static {
        for(int i = 0; i < pool.length; i++) {
            pool[i] = new ExEightConnectin();
        }
    }
    public static ExEightConnectin getConnection() {
        if(counter < pool.length) {return pool[counter++];}
        return null;
    }
}
