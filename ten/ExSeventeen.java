package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/16.
 */

/**
 * @author:Administrator
 * @date:2017/11/16
 * @description:
 */
interface Tossing { boolean event(); }

interface TossingFactory { Tossing getTossing(); }

class CoinTossing implements Tossing {
    private int events;
    private static final int EVENTS = 2;
    @Override
    public boolean event() {
        System.out.println("Coin tossing event " + events);
        return ++events != EVENTS;
    }
    public static TossingFactory factory = new TossingFactory() {
        @Override
        public CoinTossing getTossing() {
            return new CoinTossing();
        }
    };
}

class DiceTossing implements Tossing {


    private int events;
    private static final int EVENTS = 6;
    @Override
    public boolean event() {
        System.out.println("Dice tossing event " + events);
        return ++events != EVENTS;
    }
    public static TossingFactory factory = new TossingFactory() {
        @Override
        public DiceTossing getTossing() { return new DiceTossing();
        }
    };
}
public class ExSeventeen {
    public static void simulate(TossingFactory fact) {
        Tossing t = fact.getTossing();
        while(t.event()){}

    }
    public static void main(String[] args) {
        simulate(CoinTossing.factory);
        simulate(DiceTossing.factory);
    }
}
