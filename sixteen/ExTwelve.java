package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import java.util.Arrays;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */

public class ExTwelve {
    public static void main(String[] args) {
        double[] d = ConvertTo.primitive(Generated.array(
                Double.class, new CountingGenerator.Double(), 15));
        System.out.println(Arrays.toString(d));
    }
}
