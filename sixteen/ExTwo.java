package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import java.util.Arrays;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */

public class ExTwo {
    public static BerylliumSphere[] f(int size){
        BerylliumSphere[] berylliumSpheres = new BerylliumSphere[size];
        for (int i=0; i<berylliumSpheres.length; i++){
            berylliumSpheres[i]=new BerylliumSphere();
        }
        return berylliumSpheres;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(5)));
    }
}
