package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */
class Glyph{
    void draw (){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph brfore draw()");
        draw();
        System.out.println("Glyph after draw()");
    }
}
class RoundGlyph extends Glyph{
    private int radius =1;
    RoundGlyph(int r){
        radius =r;
        System.out.println("RoundGlyph.RoundGlyph() , radius = "+ radius);
    }
    @Override
    void draw(){
        System.out.println("RoundGlyph.draw(), radius = "+radius);
    }
}
class RectangularGlyph extends Glyph {
    private int width = 4;
    private int height = 5;
    RectangularGlyph(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("RectangularGlyph.RectangularGlyph(), width = " +
                width + ", height = " + height);
    }
    @Override
    void draw() {
        System.out.println("RectangularGlyph.draw(), area = " + width * height);
    }
}
public class ExFifteen {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(2,2);
    }
}
