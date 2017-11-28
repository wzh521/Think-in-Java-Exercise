package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/22.
 */

/**
 * @author:Administrator
 * @date:2017/11/22
 * @description:
 */
import java.util.*;
import java.lang.reflect.*;

class HShape {


    boolean highlighted = false;
    public void highlight() { highlighted = true; } public void clearHighlight() {
        highlighted = false; } void draw() { System.out.println(this + " draw()"); }
    public String toString() {
        return getClass().getName() +
                (highlighted ? " highlighted" : " normal");
    }
    static List<HShape> shapes = new ArrayList<HShape>();
    HShape() { shapes.add(this); }
    static void highlight1(Class<?> type) {
        for(HShape shape : shapes)
            if(type.isInstance(shape))
            shape.highlight();
    }
    static void clearHighlight1(Class<?> type) {
        for(HShape shape : shapes)
        if(type.isInstance(shape)) shape.clearHighlight();
    }
    static void forEach(Class<?> type, String method) {
        try {
        Method m =
                HShape.class.getMethod(method, (Class<?>[])null);
            for(HShape shape : shapes)
            if(type.isInstance(shape)) m.invoke(shape, (Object[])null);
    } catch(Exception e) {
        throw new RuntimeException(e);
    }
    }
    static void highlight2(Class<?> type) { forEach(type, "highlight");
    }
    static void clearHighlight2(Class<?> type) { forEach(type, "clearHighlight");
    }
}
class HCircle extends HShape {}
class HSquare extends HShape {}
class HTriangle extends HShape {}

public class ExSix {
    public static void main(String[] args) {
        List<HShape> shapes = Arrays.asList(
                new HCircle(), new HSquare(), new HTriangle(), new HSquare(),
                new HTriangle(), new HCircle(), new HCircle(), new HSquare());
        HShape.highlight1(HCircle.class); HShape.highlight2(HCircle.class);
        for(HShape shape : shapes)
            shape.draw();
        System.out.println("*******");
         HShape.highlight1(HShape.class);
        HShape.highlight2(HShape.class);
        for(HShape shape : shapes)
        shape.draw(); System.out.println("*******");
         HShape.clearHighlight1(ArrayList.class);
        HShape.clearHighlight2(ArrayList.class);
        for(HShape shape : shapes)
        shape.draw();
    }
}
