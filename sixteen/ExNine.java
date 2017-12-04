package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import java.util.ArrayList;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */
class Banana {
    private final int id;
    Banana(int id) { this.id = id; }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
class Peel<T> {
    T fruit;
    Peel(T fruit) { this.fruit = fruit; }
    void peel() { System.out.println("Peeling "+ fruit); }
}
public class ExNine {
    public static void main(String[] args) {
       // Peel<Banana>[] peels=new Peel<Banana>[1];
        ArrayList<Peel<Banana>> a =
                new ArrayList<Peel<Banana>>();
        for(int i = 0; i < 10; i++)
            a.add(new Peel<Banana>(new Banana(i)));
        for(Peel<Banana> p : a)
            p.peel();
    }
}
