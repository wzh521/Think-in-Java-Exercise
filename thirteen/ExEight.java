package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

import java.util.Arrays;

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */
class Splitting{
    public static String knights=
            "Then ,whe you have the shrubberu, you must "+
            "cut dowm the mightiest tree in the foresht..."+"with... a herring";
    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }
}
public class ExEight {
    public static void main(String[] args) {
        Splitting.split("the|you");
    }
}
