package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */

public class ExFive {
    public static void ride(Cycle1 cycle1){
        System.out.println("The number is "+cycle1.getWheels());
    }
    public static void main(String[] args) {
        ride(new Unicycle1());
        ride(new Bicycle1());
        ride(new Tricycle1());

    }
}
