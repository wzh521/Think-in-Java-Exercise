package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/2.
 */

/**
 * @author:Administrator
 * @date:2017/12/2
 * @description:
 */

public class ExTwentySix {
    public static void main(String[] args) {
        Number[] numbers = new Integer[10];
        numbers[0]=Integer.valueOf(1);
        // Runtime type is Integer[], not Float[] or Byte[]:
        try {
            numbers[1] = new Float(1.0); // ArrayStoreException
        } catch(Exception e) { System.out.println(e); }
        try {


        numbers[2] = Byte.valueOf((byte)1);
        } catch(Exception e) { System.out.println(e); }
    }
}
