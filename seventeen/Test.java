package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/28.
 */

/**
 * @author:Administrator
 * @date:2017/12/28
 * @description:
 */

public abstract class Test<C> {
    String name;
    public Test(String name) { this.name = name; }
    abstract int test(C container, TestParam tp);
}
