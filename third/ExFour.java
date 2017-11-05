package com.wzh.thik.in.java.third;/**
 * Created by Administrator on 2017/11/5.
 */

/**
 * @author:Administrator
 * @date:2017/11/5
 * @description:
 */

public class ExFour {
    public static void main(String[] args) {
        if(args.length < 2) {
        System.err.println(
                "Usage: java E04_Velocity distance time");
            System.exit(1);
    }
        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[1]);
        System.out.print("Velocity = ");
        System.out.print(distance / time);

    }
}
