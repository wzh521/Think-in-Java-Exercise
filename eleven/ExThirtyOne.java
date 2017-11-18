package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/18.
 */
import java.util.*;
/**
 * @author:Administrator
 * @date:2017/11/18
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
class RandomShapeGenerator implements Iterable<Shape> {
    private Random rand = new Random(47);
    private final int quantity;

    RandomShapeGenerator(int quantity) {
        this.quantity = quantity;
    }

    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int count;

            public boolean hasNext() {
                return count < quantity;
            }

            public Shape next() {
                ++count;
                return nextShape();
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    private Shape nextShape() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }

    }
}
public class ExThirtyOne {
    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator(10);
        for(Shape shape : rsg)
            System.out.println(shape.getClass().getSimpleName());
    }

}
