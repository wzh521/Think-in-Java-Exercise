package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/3.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/12/3
 * @description:
 */

public class ExThirtyFive {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyAmericanos) {
        probablyAmericanos.add(new Breve());
    }

    public static void main(String[] args) {
        List<Americano> am1 = new ArrayList<Americano>();
        oldStyleMethod(am1);
        List<Americano> am2 = Collections.checkedList(
                new ArrayList<Americano>(), Americano.class);
        try {
            oldStyleMethod(am2); // Throws an exception
        } catch(Exception e) {
            System.out.println(e);
        }
        List<Coffee> coffees = Collections.checkedList( new ArrayList<Coffee>(), Coffee.class);
        coffees.add(new Americano());
        coffees.add(new Breve());
    }
}
