package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/22.
 */

import java.util.Arrays;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/11/22
 * @description:
 */
class Shape{
    public void draw(){}
    public void erase(){}
    public void msg(){
        System.out.println("hello this is Shape");
    }


}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Circle draw()");
    }
    @Override
    public void erase(){
        System.out.println("Circle erase()");
    }
    @Override
    public void msg(){
        System.out.println("Circle msg()");
    }

}
class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Square draw()");
    }
    @Override
    public void erase(){
        System.out.println("Square erase()");
    }

}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Triangle drw()");
    }
    @Override
    public void erase(){
        System.out.println("Triangle erase()");
    }

}
class  Tetrahedron extends Shape{
    @Override
    public void draw(){
        System.out.println("Tetrahedron draw()");
    }
    @Override
    public void erase(){
        System.out.println("Tetrahedron erase()");
    }
}
class Rhomboid extends Shape{
    @Override
    public String toString() { return "Rhomboid"; }
}
public class ExThree {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for(Shape shape : shapes) {
            shape.draw();
        }
        Shape shape = new Rhomboid();
        Rhomboid rhomboid =(Rhomboid)shape;
//        Circle c = (Circle)shape;
//        c.draw();


    }
}
