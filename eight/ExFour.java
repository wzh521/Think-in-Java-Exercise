package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */

public class ExFour {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(), new Square(), new Triangle(), new Tetrahedron()
        };
        for(Shape shape : shapes) {
        shape.draw();shape.erase(); shape.msg();
    }
    }
}
