package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/3.
 */

import java.awt.*;

/**
 * @author:Administrator
 * @date:2017/12/3
 * @description:
 */
class BasicCoffee{
    private String type;
    public BasicCoffee() {}
    public BasicCoffee(String type) { setType(type); }
    public void setType(String type) { this.type = type; }
    public String getType() { return type; }
}
class  CoffeeDecorator extends  BasicCoffee{
    protected BasicCoffee basic;
    public CoffeeDecorator(BasicCoffee basic) { this.basic = basic;
    }
    @Override
    public void setType(String type) { basic.setType(type); }
    @Override
    public String getType() { return basic.getType(); }
}
class SteamedMilk extends CoffeeDecorator { public SteamedMilk(BasicCoffee basic) {
    super(basic);
    setType(getType() + " & steamed milk");
}
}

class Foam extends CoffeeDecorator {
    public Foam(BasicCoffee basic) {
    super(basic);
    setType(getType() + " & foam");
}
}
class Chocolate extends CoffeeDecorator {
    private final Color color;
    public Chocolate(BasicCoffee basic, Color color) { super(basic);
        this.color = color;
        setType(getType() + " & chocolate[color = " + getColor() + "]");
    }
    public Color getColor() { return color; }
}

class Caramel extends CoffeeDecorator { public Caramel(BasicCoffee basic) {
    super(basic);
    setType(getType() + " & caramel");
}
}

class WhippedCream extends CoffeeDecorator {
    public WhippedCream(BasicCoffee basic) {
    super(basic);
    setType(getType() + " & whipped cream");
}
}
public class ExThirtyEight {
    public static void main(String[] args) {
        CoffeeDecorator cappuccino = new Foam(
                new SteamedMilk(new BasicCoffee("espresso")));
        System.out.println(
                "Capuccino is: " + cappuccino.getType());
        CoffeeDecorator whiteChocolateCoffee = new WhippedCream(
                new Chocolate(
                        new BasicCoffee("hot coffee"), Color.WHITE)); System.out.println("White Chocolate Coffee is: " +
                whiteChocolateCoffee.getType());
    }
}
