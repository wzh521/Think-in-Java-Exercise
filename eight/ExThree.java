package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */

public class ExThree {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Circle(), new Square(), new Triangle()};
        for (Shape shape :shapes){
            shape.draw();
            shape.msg();
        }
    }
}
