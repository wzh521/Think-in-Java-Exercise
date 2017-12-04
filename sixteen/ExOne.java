package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */
class BerylliumSphere{
    private static long counter;
    private final long id=counter++;
    @Override
    public String toString(){
        return "Sphere "+id;
    }
}
public class ExOne {
    static void hide(BerylliumSphere[] s) {
        System.out.println("Hiding " + s.length + " sphere(s)");
    }

    public static void main(String[] args) {
        hide(new BerylliumSphere[]{ new BerylliumSphere(), new BerylliumSphere() });
        BerylliumSphere[] d = { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() };

        hide(d);
        BerylliumSphere[] a = new BerylliumSphere[]{
                new BerylliumSphere(), new BerylliumSphere() }; hide(a);
    }
}
