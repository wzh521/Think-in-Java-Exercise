package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */
interface Cycle{
    int wheels();
}
interface CycleFactory {
    Cycle getCycle();
}
class Unicycle implements Cycle {
    @Override
    public int wheels() { return 1; }
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Unicycle getCycle() { return new Unicycle(); }
}

class Bicycle implements Cycle {
    @Override
    public int wheels() { return 2; }
}


class BicycleFactory implements CycleFactory {
    @Override
    public Bicycle getCycle() { return new Bicycle(); }
}

class Tricycle implements Cycle {
    @Override
    public int wheels() { return 3; }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Tricycle getCycle() {
        return new Tricycle();
    }
}

public class ExEightteen {
    public static void ride(CycleFactory fact) {
        Cycle c = fact.getCycle();
        System.out.println("Num. of wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        ride(new UnicycleFactory());
        ride(new BicycleFactory ());
        ride(new TricycleFactory ());
    }
}
