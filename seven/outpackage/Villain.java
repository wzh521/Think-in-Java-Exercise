package com.wzh.thik.in.java.seven.outpackage;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */

public class Villain {
    private String name;
    protected void setName(String name){
        this.name = name;
    }
    public Villain(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return "I'm a Villain and my name is "+name;
    }
}
