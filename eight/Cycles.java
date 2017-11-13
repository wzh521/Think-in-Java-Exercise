package com.wzh.thik.in.java.eight;

/**
 * Created by Administrator on 2017/10/22.
 */
public class Cycles {
    public static void cycleRun ( CycleFactory cycleFactory){
        Service s = cycleFactory.getService();
        s.run();
    }

    public static void main(String[] args) {
        cycleRun(new BicycleFactory());
        cycleRun(new UnicycleFactory());
    }
}
interface Service {
    void run ();
}
interface CycleFactory{
    Service getService();
}
class Bicycle implements Service {
    public void run (){
        System.out.println("bicycle + run");
    }
}
class BicycleFactory implements CycleFactory{
    public Service getService (){
        return new Bicycle();
    }
}
class Unicycle implements Service{
    public void run (){
        System.out.println("Unicycle + run ");
    }
}
class UnicycleFactory implements CycleFactory{
    public Service getService (){
        return new Unicycle();
    }
}
