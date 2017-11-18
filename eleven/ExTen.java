package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/18.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/11/18
 * @description:
 */
class Rodent {
    public void hop() { System.out.println("Rodent hopping"); }
    public void scurry() { System.out.println("Rodent scurrying"); }
    public void reproduce() { System.out.println("Making more Rodents"); }
    @Override
    public String toString() { return "Rodent"; }
}

class Mouse extends Rodent {
    @Override
    public void hop() { System.out.println("Mouse hopping"); }
    @Override
    public void scurry() { System.out.println("Mouse scurrying"); }
    @Override
    public void reproduce() { System.out.println("Making more Mice"); }
    @Override
    public String toString() { return "Mouse"; }
}

class Hamster extends Rodent {
    @Override
    public void hop() { System.out.println("Hamster hopping"); }
    @Override
    public void scurry() { System.out.println("Hamster scurrying"); }
    @Override
    public void reproduce() { System.out.println("Making more Hamsters"); }
    @Override
    public String toString() { return "Hamster"; }
}
public class ExTen {
    public static void main(String[] args) {
        List<Rodent> list = new ArrayList<>();
        list.add(new Rodent());
        list.add(new Mouse());
        list.add(new Hamster());
        Iterator<Rodent>it = list.iterator();
        while(it.hasNext()){
            Rodent rodent = it.next();
            rodent.hop();
            rodent.scurry();
            rodent.reproduce();
            System.out.println(rodent);
        }
    }
}
