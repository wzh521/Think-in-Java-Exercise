package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import java.util.Arrays;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */

public class ExSeven {
    static BerylliumSphere[][][] fill(int xLen, int yLen, int zLen) {
        BerylliumSphere[][][] a =
                new BerylliumSphere[xLen][yLen][zLen];
        for(int i = 0; i < xLen; i++)
            for(int j = 0; j < yLen; j++)
                for(int k = 0; k < zLen; k++)
                    a[i][j][k] = new BerylliumSphere();
        return a;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(fill(3, 3, 3)));
    }
}
