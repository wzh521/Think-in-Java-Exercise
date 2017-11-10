package com.wzh.thik.in.java.six;/**
 * Created by Administrator on 2017/11/10.
 */

import com.wzh.thik.in.java.six.test.ExEightConnectin;
import com.wzh.thik.in.java.six.test.ExEightConnectionManger;

/**
 * @author:Administrator
 * @date:2017/11/10
 * @description:
 */

public class ExEight {
    public static void main(String[] args) {
        ExEightConnectin c= ExEightConnectionManger.getConnection();
        while(c != null) {
            System.out.println(c); c.doSomething();
            c = ExEightConnectionManger.getConnection();
        }
    }
}
