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
abstract class RShape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
    void rotate(int degrees) { System.out.println("Rotating " + this +
            " by " + degrees + " degrees");
    }
}

class RCircle extends RShape {
    @Override
    public String toString() { return "Circle"; }
    @Override
    void rotate(int degrees) {
        throw new UnsupportedOperationException();
    }


}

class RSquare extends RShape {
    @Override
    public String toString() { return "Square"; }
}

class RTriangle extends RShape {
    @Override
    public String toString() { return "Triangle"; }
}
public class ExFive {
    static void rotateAll(List<RShape> shapes) {
        for(RShape shape : shapes) {
            if (!(shape instanceof RCircle)) { shape.rotate(45); }
        }
    }

    public static void main(String[] args) {
        List<RShape> shapes = Arrays.asList(
                new RCircle(), new RSquare(), new RTriangle()
        );
        rotateAll(shapes);
    }
}
