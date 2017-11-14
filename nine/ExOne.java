package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */
abstract class Rodent{
    public abstract void hop();
    public abstract void scurry();
    public abstract void reproduce();
}
class Mouse extends Rodent{

    @Override
    public void hop() {
        System.out.println("Mouse hop()");
    }

    @Override
    public void scurry() {
        System.out.println("Mouse scurry()");
    }

    @Override
    public void reproduce() {
        System.out.println("Mouse reproduce()");
    }
    @Override
    public String toString(){
        return "Mouse";
    }
}
class Gerbil extends Rodent{

    @Override
    public void hop() {
        System.out.println("Gerbil hop()");
    }

    @Override
    public void scurry() {
        System.out.println("Gerbil scurry()");
    }

    @Override
    public void reproduce() {
        System.out.println("Gerbil reproduce()");
    }
    @Override
    public String toString(){
       return "Gerbil";
    }
}
class Hamster extends Rodent{

    @Override
    public void hop() {
        System.out.println("Hamster hop()");
    }

    @Override
    public void scurry() {
        System.out.println("Hamster scurry()");
    }

    @Override
    public void reproduce() {
        System.out.println("Hamster reproduce()");
    }
    @Override
    public String toString(){
        return "Hamster";
    }
}
public class ExOne {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(),new Gerbil(),new Hamster()};
        for(Rodent r:rodents){
            r.hop();
            r.reproduce();
            r.scurry();
            System.out.println(r);
        }
    }
}
