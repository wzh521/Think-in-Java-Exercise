package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */
class Amphibian1{
    public void moveInWater(){
        System.out.println("Move in Water");

    }
    public void moveOnLand(){
        System.out.println("Move on Land");
    }

}
class Frog1 extends Amphibian1{}
public class SixTeen {
    public static void main(String[] args) {
        Amphibian1 amphibian1 = new Frog1();
        amphibian1.moveInWater();
        amphibian1.moveOnLand();

    }
}
