package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */
class ComparableBerylliumSphere extends BerylliumSphere implements Comparable<BerylliumSphere> {
    static long getID(BerylliumSphere bs) {
        try {
        Field fid = BerylliumSphere.class.getDeclaredField("id");
        fid.setAccessible(true);
            return fid.getLong(bs);
    } catch(Exception e) { e.printStackTrace();
        return 0L;	// Bogus value
    }
    }
    @Override
    public int compareTo(BerylliumSphere rv) {
        long id = getID(this);
        long rvid = getID(rv);
        return (id < rvid ? -1 : (id == rvid ? 0 : 1));
    }
}
public class ExTwentyOne {
    public static void main(String[] args) {
        Random r = new Random(47); BerylliumSphere[] a = Generated.array(
                BerylliumSphere.class, new BSGenerator(), 5); 
        Collections.shuffle(Arrays.asList(a), r);
        System.out.println("Before sort 1: a = " + Arrays.toString(a)); try {
            Arrays.sort(a);
            System.out.println("After sort 1: a = " + Arrays.toString(a));
        } catch(ClassCastException e) { System.out.println("Array cannot be sorted!");
        }
        for(int i = 0; i < a.length; i++)
            a[i] = new ComparableBerylliumSphere(); Collections.shuffle(Arrays.asList(a), r);
        System.out.println("Before sort 2: a = " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sort 2: a = " + Arrays.toString(a));
        Collections.shuffle(Arrays.asList(a), r);
        System.out.println("Before rev. sort 3: a = " + Arrays.toString(a));


        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("After rev. sort 3: a = " + Arrays.toString(a));
    }
}
