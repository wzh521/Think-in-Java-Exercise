package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import com.wzh.thik.in.java.eleven.Generator;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */
class Fill {
    public static void
    primitive(Object array, Generator<?> gen) {
        int size = Array.getLength(array);
        Class<?> type = array.getClass().getComponentType();
        for(int i = 0; i < size; i++)
            if(type == Boolean.TYPE)
                Array.setBoolean(array, i, (Boolean)gen.next());
            else if (type == Byte.TYPE)
                Array.setByte(array, i, (Byte)gen.next());
            else if (type == Short.TYPE)
                Array.setShort(array, i, (Short)gen.next());
            else if (type == Integer.TYPE)
                Array.setInt(array, i, (Integer)gen.next());
            else if (type == Character.TYPE)
                Array.setChar(array, i, (Character)gen.next());
            else if (type == Float.TYPE)
                Array.setFloat(array, i, (Float)gen.next());
            else if (type == Double.TYPE)
                Array.setDouble(array, i, (Double)gen.next());
            else if (type == Long.TYPE)
                Array.setLong(array, i, (Long)gen.next());
    }
}
public class ExFourteen {
    public static void main(String[] args) {
        int size = 6;
        boolean[] a1 = new boolean[size]; 
        byte[] a2 = new byte[size];
        char[] a3 = new char[size];


        short[] a4 = new short[size];
        int[] a5 = new int[size]; 
        long[] a6 = new long[size]; 
        float[] a7 = new float[size]; 
        double[] a8 = new double[size];
    Fill.primitive(a1, new CountingGenerator.Boolean()); 
        System.out.println("a1 = " + Arrays.toString(a1));
        Fill.primitive(a2, new CountingGenerator.Byte());
        System.out.println("a2 = " + Arrays.toString(a2)); 
        Fill.primitive(a3, new CountingGenerator.Character());
        System.out.println("a3 = " + Arrays.toString(a3));
        Fill.primitive(a4, new CountingGenerator.Short());
        System.out.println("a4 = " + Arrays.toString(a4)); 
        Fill.primitive(a5, new CountingGenerator.Integer());
        System.out.println("a5 = " + Arrays.toString(a5)); 
        Fill.primitive(a6, new CountingGenerator.Long());
        System.out.println("a6 = " + Arrays.toString(a6));
        Fill.primitive(a7, new CountingGenerator.Float()); 
        System.out.println("a7 = " + Arrays.toString(a7)); 
        Fill.primitive(a8, new CountingGenerator.Double()); 
        System.out.println("a8 = " + Arrays.toString(a8));
    }
}
