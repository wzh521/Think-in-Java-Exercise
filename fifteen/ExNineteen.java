package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/30.
 */

import com.wzh.thik.in.java.eleven.Generator;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/11/30
 * @description:
 */
class Product{
    private final int id;
    private String description;
    private double price;
    public Product(int id, String description, double price){
        this.id=id;
        this.description=description;
        this.price=price;
        System.out.println(toString());
    }
    @Override
    public String toString(){
        return id+": "+description+" , "+price;
    }
    public void priceChange(double change){
        price+=change;
    }
    public static Generator<Product> productGenerator = new Generator<Product>() {
        private Random random = new Random(47);
        @Override
        public Product next() {
            return new Product(random.nextInt(100),"Test",Math.round(random.nextDouble()*1000.0)+0.99);
        }
    };
}
class Container extends ArrayList<Product>{
    public Container(int size){
        Generators.fill(this,Product.productGenerator,size);
    }
}
class CargoHold extends ArrayList<Container> {
    public CargoHold(int nContainers, int nProducts) {
    for(int i = 0; i < nContainers; i++) {
        add(new Container(nProducts));
    }
}
}

class Crane {}
class CommandSection {}
class CargoShip extends ArrayList<CargoHold> {
    private ArrayList<Crane> cranes = new ArrayList<Crane>();
    private CommandSection cmdSection = new CommandSection();
    public CargoShip(int nCargoHolds, int nContainers,
                     int nProducts) {
        for(int i = 0; i < nCargoHolds; i++)
            add(new CargoHold(nContainers, nProducts));
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(CargoHold ch : this)
            for(Container c : ch)
                for(Product p : c) {
                result.append(p);
                    result.append("\n");
            }
        return result.toString();
    }
}

public class ExNineteen {
    public static void main(String[] args) {
        System.out.println(new CargoShip(14, 5, 10));
    }
}
