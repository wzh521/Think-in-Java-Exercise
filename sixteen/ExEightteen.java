package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */

public class ExEightteen {
    static void setID(BerylliumSphere bs, long value) {
        try {
            Field fid = BerylliumSphere.class.getDeclaredField("id");
            fid.setAccessible(true);
            fid.setLong(bs, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BerylliumSphere[] a = new BerylliumSphere[4];
        Arrays.fill(a, new BerylliumSphere());
        BerylliumSphere[] b = new BerylliumSphere[4];
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.arraycopy(a, 0, b, 0, b.length);
        System.out.println("b = " + Arrays.toString(b));
        a[1] = a[3] = new BerylliumSphere();
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        setID(a[0], -1L);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}
