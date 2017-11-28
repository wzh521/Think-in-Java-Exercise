package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/22.
 */

/**
 * @author:Administrator
 * @date:2017/11/22
 * @description:
 */

public class ExFour {
    public static void main(String[] args) {
        Shape shape = new Rhomboid();
        Rhomboid r = (Rhomboid)shape;
        Circle c = null;
        if(shape instanceof Circle){
            c = (Circle)shape;
        }
        else {
            System.out.println("shape not a Circle");
        }
    }
}
