package com.wzh.thik.in.java.six.test;/**
 * Created by Administrator on 2017/11/10.
 */

/**
 * @author:Administrator
 * @date:2017/11/10
 * @description:
 */

public class ExEightConnectin {
    private static int counter = 0;
    private int id = counter++;
     ExEightConnectin(){

    }
    @Override
    public String toString() { return "Connection " + id;
    }
    public void doSomething() {}
}
