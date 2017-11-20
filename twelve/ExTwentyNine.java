package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class BaseballException2 extends RuntimeException {} class Foul2 extends BaseballException2 {}
class Strike2 extends BaseballException2 {}

abstract class Inning2 { Inning2() {}
    public void event() {} abstract void atBat(); void walk() {}
}

class StormException2 extends RuntimeException {} class RainedOut2 extends StormException2 {}
class PopFoul2 extends Foul2 {}


interface Storm2 { void event(); void rainHard();
}

class StormyInning2 extends Inning2 implements Storm2 { StormyInning2() {}
    StormyInning2(String s) {} public void rainHard() {}
    void atBat() { throw new PopFoul2(); }
}
public class ExTwentyNine {
    public static void main(String[] args) {
        StormyInning2 si = new StormyInning2(); si.atBat();
    }
}
