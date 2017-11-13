package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */
class Cycle1{
    public int getWheels(){return 1;}
}
class Unicycle1 extends Cycle1{
    @Override
    public int getWheels(){return 2;}
}
class Bicycle1 extends Cycle1{
    @Override
    public int getWheels(){return 3;}
}
class Tricycle1 extends Cycle1 {
    @Override
    public int getWheels(){return 4;}
}

public class ExOne {
    public static void ride(Cycle1 c){
        System.out.println(c.getClass().getName());
    }

    public static void main(String[] args) {

        ride(new Cycle1());	// No upcasting
        ride(new Unicycle1()); // Upcast
        ride(new Bicycle1());	// Upcast
        ride(new Tricycle1()); // Upcast
    }
}
