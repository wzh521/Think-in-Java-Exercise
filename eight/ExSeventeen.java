package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */
 class Unicycle2 extends Cycle1 { public void balance() {}
}


 class Bicycle2 extends Cycle1 { public void balance() {}
}


public class ExSeventeen {
    public static void main(String[] args) {
      Cycle1[]  cycles = new Cycle1[]{ new Unicycle2(),
                new Bicycle2(), new Tricycle1() };
        //cycles[0].balance();
        // cycles[1].balance();
        // cycles[2].balance();
        ((Unicycle2)cycles[0]).balance();// Downcast/RTTI
        ((Bicycle2)cycles[1]).balance();	// Downcast/RTTI
       //  ((Unicycle1)cycles[2]).balance();	// Exception thrown
    }
}
