package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/3.
 */

import java.awt.*;
import java.util.Date;
import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/12/3
 * @description:
 */
interface TimeStamped{
    long getStamp();
}
class TimeStampedImp implements TimeStamped{
    private final long timeStamp;
    public TimeStampedImp(){
        timeStamp=System.currentTimeMillis();
    }
    @Override
    public long getStamp() {
        return timeStamp;
    }
}
interface SerialNumbered {
    long getSerialNumber();
}
class SerialNumberedImp implements SerialNumbered{
    private static long counter=1;
    private final long serialNumber=counter++;
    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
}
interface Basic{
    public void set(String val);
    public String get();
}
class BasicImp implements Basic{
    private String value;
    @Override
    public void set(String val) {
        value=val;
    }

    @Override
    public String get() {
        return value;
    }
}
interface Colored { Color getColor(); }

class ColoredImp implements Colored {
    private static Random rnd = new Random(47);
    private final Color clr =
        new Color(rnd.nextInt(16777216));

    @Override
    public Color getColor() {
        return clr;
    }
}
class Mixin extends BasicImp
    implements TimeStamped,SerialNumbered{
    private TimeStamped timeStamped = new TimeStampedImp();
    private SerialNumbered serialNumbered = new SerialNumberedImp();
    @Override
    public long getSerialNumber() {
        return serialNumbered.getSerialNumber();
    }

    @Override
    public long getStamp() {
        return timeStamped.getStamp();
    }
}
class Mixin2 extends Mixin implements Colored {
    private Colored colored = new ColoredImp();
    @Override
    public Color getColor() { return colored.getColor(); }
}
public class ExThirtySeven {
    public static void main(String[] args) {
        Mixin2 mixin1 = new Mixin2(), mixin2 = new Mixin2(); mixin1.set("test string 1");
        mixin2.set("test string 2"); System.out.println(mixin1.get() + " " +
                mixin1.getStamp() +	" " +
                mixin1.getSerialNumber() + " " + mixin1.getColor()); System.out.println(mixin2.get() + " " +
                mixin2.getStamp() +	" " +
                mixin2.getSerialNumber() + " " + mixin2.getColor());
    }
}
