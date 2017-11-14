package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */
interface CanFight{
    void fight();
}
interface CanSwim{
    void swim();
}
interface CanFly{
    void fly();
}
interface CanClimb{
    void climb();
}
class ActionCharacter{
    public void fight(){

    }
}

class Hero extends ActionCharacter
        implements CanFight,CanSwim,CanFly,CanClimb{

    @Override
    public void climb() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

public class ExTwelve {
    static void t(CanFight x) { x.fight(); }
    static void u(CanSwim x) { x.swim(); }
    static void v(CanFly x) { x.fly(); }
    static void z(CanClimb x) { x.climb(); }
    static void w(ActionCharacter x) { x.fight(); }
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        z(h); // Treat it as a CanClimb
        w(h); // Treat it as an ActionCharacter
    }
}
