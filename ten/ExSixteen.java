package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/16.
 */

/**
 * @author:Administrator
 * @date:2017/11/16
 * @description:
 */
interface Cycle{
    int wheels();
}
interface CycleFactory{
    Cycle getCycle();
}
class Unicycle implements Cycle{
    @Override
    public int wheels() {
        return 1;
    }
   public static CycleFactory factory  = new CycleFactory() {
       @Override
       public Cycle getCycle() {
           return new Unicycle();
       }
   };
}
class Bicycle implements Cycle{
    @Override
    public int wheels() {
        return 2;
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}
class Tricycle implements Cycle{

    @Override
    public int wheels() {
        return 3;
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }

    };
}
public class ExSixteen {
    public static void ride(CycleFactory cycleFactory){
        Cycle cycle = cycleFactory.getCycle();
        System.out.println(cycle.getClass().getName()+ cycle.wheels());
    }

    public static void main(String[] args) {
        ride(Unicycle.factory);
        ride(Bicycle.factory);
        ride(Tricycle.factory);
    }
}
