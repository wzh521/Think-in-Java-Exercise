package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */

class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}
class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}
class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}
class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}
class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
}
class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch");
    }
}
class Pickle {
    Pickle() {
        System.out.println("Pickle()");
    }
}
class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle pickle = new Pickle();

    Sandwich() {
        System.out.println("Sandwich()");
    }
}
interface FastFood{
    void rushOrder();
    void gobble();
}
class FastSandwich extends Sandwich implements FastFood {

    @Override
    public void rushOrder() {
        System.out.println("Rushing your sandwich order");
}
    @Override
    public void gobble() {
        System.out.println("Chomp! Snort! Gobble!");
    }
}
public class ExEight {
    public static void main(String[] args) {
        FastSandwich burger = new FastSandwich();
        System.out.println("Fries with that?");
        System.out.println("Super Size?");
        burger.rushOrder();
        burger.gobble();
    }

}
