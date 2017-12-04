package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import java.util.Locale;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */

public class ExThird {
    public static double[][] twoDDoubleArray(
            int xLen, int yLen, double valStart, double valEnd) {
        double[][] array = new double[xLen][yLen];
        double increment = (valEnd - valStart)/(xLen * yLen);
        double val = valStart;
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++) {
            array[i][j] = val;
                val += increment;
        }
        return array;
    }
    public static void printArray(double[][] array) {
        for(int i = 0; i < array.length; i++) {
        for(int j = 0; j < array[i].length; j++)
            System.out.printf(Locale.US, "%.2f ", array[i][j]);
        System.out.println();
    }
    }

    public static void main(String[] args) {
        double[][] twoD = twoDDoubleArray(4, 6, 47.0, 99.0);
        printArray(twoD);
        System.out.println("**********************");
        double[][] twoD2 = twoDDoubleArray(2, 2, 47.0, 99.0);
        printArray(twoD2);
        System.out.println("**********************");
        double[][] twoD3 = twoDDoubleArray(9, 5, 47.0, 99.0);
        printArray(twoD3);
    }
}
