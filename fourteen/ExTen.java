package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/22.
 */

/**
 * @author:Administrator
 * @date:2017/11/22
 * @description:
 */

public class ExTen {
    public static void main(String[] args) {
        char[] ac = "Hello, World!".toCharArray(); 
        System.out.println("ac.getClass() = " + ac.getClass()); 
        System.out.println("ac.getClass().getSuperclass() = "
                + ac.getClass().getSuperclass());
        char c = 'c';
//! c.getClass(); // Can't do it, primitives
        int[] ia = new int[3];
        System.out.println("ia.getClass() = " + ia.getClass()); 
        long[] la = new long[3]; 
        System.out.println("la.getClass() = " + la.getClass()); 
        double[] da = new double[3];
        System.out.println("da.getClass() = " + da.getClass());
        String[] sa = new String[3]; 
        System.out.println("sa.getClass() = " + sa.getClass()); 
      
}
}
