package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/11/13
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
class RandomShapeGenerator{
    private Random random = new Random(47);
    public Shape next(){
        switch(random.nextInt(3)){
            default:
            case 0 : return new Circle();
            case 1 : return new Square();
            case 2 : return new Triangle();
        }
    }
}
public class ExTwo {
 private  static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i=0; i<shapes.length; i++){
            shapes[i]=randomShapeGenerator.next();
        }
        for (Shape shape : shapes){
            shape.draw();
        }

    }
}
