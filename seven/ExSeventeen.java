package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/12.
 */

/**
 * @author:Administrator
 * @date:2017/11/12
 * @description:
 */

class Amphibian2{
    public void moveInWater(){
        System.out.println("Move in Water");

    }
    public void moveOnLand(){
        System.out.println("Move on Land");
    }

}
class Frog2 extends Amphibian2{
    @Override
    public void moveInWater(){
        System.out.println(" frog2 Move in Water");

    }
    @Override
    public void moveOnLand(){
        System.out.println(" frog2 Move on Land");
    }

}
public class ExSeventeen {
    public static void main(String[] args) {
        Amphibian2 amphibian2 = new Frog2();
        amphibian2.moveOnLand();
        amphibian2.moveInWater();
    }

}
